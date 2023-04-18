package adb_tool.folder;

import java.io.Serializable;

class ADB_File implements Serializable {
    
    private String FileName;
    private String FileSize;

    public ADB_File() {
    }

    public ADB_File(String FileName, String FileSize) {
        this.FileName = FileName;
        this.FileSize = FileSize;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }
    
}

