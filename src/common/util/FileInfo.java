/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.util;

import java.io.File;


public class FileInfo {

    private String fileName;
    private String createTime;
    private String modifyTime;
    private String lastReadTime;
    private String isReadOnly;
    private String fileLength;

    @Override
    public String toString(){
        return "fileName:"+fileName+",lastReadTime:"+lastReadTime+",isReadOnly:"+
                isReadOnly+",fileLength:"+fileLength;
    }
    public FileInfo(){
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the modifyTime
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime the modifyTime to set
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return the lastReadTime
     */
    public String getLastReadTime() {
        return lastReadTime;
    }

    /**
     * @param lastReadTime the lastReadTime to set
     */
    public void setLastReadTime(String lastReadTime) {
        this.lastReadTime = lastReadTime;
    }

    /**
     * @return the isReadOnly
     */
    public String getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * @param isReadOnly the isReadOnly to set
     */
    public void setIsReadOnly(String isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    /**
     * @return the fileLength
     */
    public String getFileLength() {
        return fileLength;
    }

    /**
     * @param fileLength the fileLength to set
     */
    public void setFileLength(String fileLength) {
        this.fileLength = fileLength;
    }

}
