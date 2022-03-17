/**
 * @author: wz
 * @date: 2021/9/2 0002
 */
public class Demo_21 {
    public static void main(String[] args) {
        String gyszx = "1";
        StringBuilder updateERP = new StringBuilder("UPDATE PURMA SET ");
        switch (gyszx) {
            case "0" :
                updateERP.append("UDF03='潜在供应商', ");
                updateERP.append("MA016='1',");
                break;
            case "1" :
                updateERP.append("UDF03='合格供应商', ");
                updateERP.append("MA016='1',");
                break;
            case "2" :
                updateERP.append("UDF03='不合格供应商', ");
                updateERP.append("MA016='3',");
                break;
            case "3" :
                updateERP.append("UDF03='风险供应商', ");
                updateERP.append("MA016='3',");
                break;
            default:
                updateERP.append("UDF03='未知供应商类型', ");
                updateERP.append("MA016='3',");
        }
        System.out.println(updateERP);
    }
}
