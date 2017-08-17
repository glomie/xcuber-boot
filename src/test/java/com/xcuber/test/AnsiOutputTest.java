package com.xcuber.test;

import java.awt.Color;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiColors;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiOutput.Enabled;
import org.springframework.boot.ansi.AnsiPropertySource;

public class AnsiOutputTest {

	public static void main(String[] args) {
		AnsiOutput.setConsoleAvailable(true);
		AnsiOutput.setEnabled(Enabled.ALWAYS);
		System.out.println(System.console());
		System.out.println(AnsiOutput.toString(AnsiColor.BLUE, "sasas", AnsiColor.RED, "sadad"));
		System.out.println(AnsiColors.getClosest(Color.CYAN).name());
		AnsiPropertySource source = new AnsiPropertySource("aaa", false);
		System.out.println(source.getProperty("AnsiColor.BLUE"));
	}
}
