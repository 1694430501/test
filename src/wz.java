/**
 * @author: wz
 * @date: 2021/8/23 0023
 */
public class wz {
    public static void main(String[] args) {
        String a = "dsdssdewfdgnbsdf";
        String[] b = a.split(" ");
        System.out.println(b[0]);

        System.out.println(a.charAt(3));//s
        System.out.println(a.substring(1,4));//sds
        System.out.println(a.substring(3));//ssd
        System.out.println(a.toUpperCase());//DSDSSD
        System.out.println(a.indexOf("dss"));//2
        System.out.println(a.lastIndexOf("f"));//15
        System.out.println(a.indexOf('d'));//0
        System.out.println(a.isEmpty());//false
        System.out.println(a.codePointAt(3));//115
        System.out.println(a.codePointBefore(2));//115
        System.out.println(a.contains("sdssdd"));//false
    }
}
