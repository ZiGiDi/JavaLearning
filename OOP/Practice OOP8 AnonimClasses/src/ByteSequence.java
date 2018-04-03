/**
 * Created by ZiGiDi on 13.01.2018.
 */
public class ByteSequence {
    private byte[] byteArray = new byte[0];
    private int n =0;

    private  void resize ( int number){
        this.n = byteArray.length;
        byte[] temp = new byte[this.byteArray.length+number];
        System.arraycopy(byteArray,0,temp,0,byteArray.length);
        byteArray = temp;
    }

    public void  addStringToSequence(String text){
        byte[] byteArrayFromString = text.getBytes();
        int number = byteArrayFromString.length;
        this.resize(number);
        System.arraycopy(byteArrayFromString,0,byteArray,n,number);
    }


    public String getString(){
        String text = new String(this.byteArray);
        return text;
    }
}
