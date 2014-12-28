

package common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesParser {

    private Properties p;

    public PropertiesParser() throws IOException{
        this("backup.properties");
    }
    public PropertiesParser(String propertiesName) throws IOException{
        InputStream in = PropertiesParser.class.getClassLoader().getResourceAsStream(propertiesName);
        p = new Properties();
        p.load(in);
    }
    //获取某一个键的值
    public String getValue(String key){
        return p.getProperty(key);
    }

}
