package com.xcuber.test;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.apache.ibatis.parsing.PropertyParser;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.parsing.XPathParser;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class XPathParserTest {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/junyan/git/xcuber-boot/target/classes/mybatis/mapper/StudentDao.xml");
        Properties properties = new Properties();
        //properties.setProperty("tableName", "tb_student");
        properties.setProperty(PropertyParser.KEY_ENABLE_DEFAULT_VALUE, "true");
        XPathParser parser = new XPathParser(reader, false, properties, new XMLMapperEntityResolver());
        XNode node = parser.evalNode("//mapper/select");
        System.out.println(node.getName());
        System.out.println(node.getStringBody());
    }
}
