/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.backup;

import common.util.PropertiesParser;
import java.io.IOException;

 
public class BackupProperties {

    private PropertiesParser pp;

    public BackupProperties() throws IOException{
        pp = new PropertiesParser("backup.properties");
    }
    //返回mysql的bin路径
    public String getMySqlPath(){
        return pp.getValue("mysql.bin");
    }
    //返回数据库备份的位置,如果不存在的话应该先新建一下
    public String getBackPath(){
        return pp.getValue("backup.path");
    }
    public String getAddBackPath(){
        return pp.getValue("addbackup.path");
    }
    //获取用户名
    public String getUser(){
        return pp.getValue("jdbc.user");
    }
    //获取密码
    public String getPassword(){
        return pp.getValue("jdbc.password");
    }
    //获取数据库名称
    public String getDatabase(){
        return pp.getValue("jdbc.database");
    }

}
