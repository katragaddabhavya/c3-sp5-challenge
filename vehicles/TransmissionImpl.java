package vehicles;

public class TransmissionImpl {
    public  static  void  main(String[] args){
        Manual manual=new Manual("Manual","MD6",6,3.640f,2.150f,1.360f,1.000f,0.750f,0.630f);
        manual.showSpec();
        System.out.println();
        AutomaticDCT automaticDCT=new AutomaticDCT("AutomaticDCT","DCT8",8,4.714f,3.143f,2.106f,1.667f,1.285f,1.000f,0.839f,0.667f);
        automaticDCT.showSpec();
    }
}