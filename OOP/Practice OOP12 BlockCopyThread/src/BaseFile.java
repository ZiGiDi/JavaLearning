public class BaseFile {
    private byte[] data;
    private long fileLenght;
    private boolean copyDone = false;

    public BaseFile() {
    }

    public synchronized byte[] getData() {
        notifyAll();
        return data;
    }

    public synchronized void setData(byte[] data) {
        notifyAll();
        this.data = data;

    }

    public long getFileLenght() {
        return fileLenght;
    }

    public void setFileLenght(long fileLenght) {
        this.fileLenght = fileLenght;
    }

    public boolean isCopy() {
        return copyDone;
    }

    public void setCopy(boolean copy) {
        this.copyDone = copy;
    }
}





