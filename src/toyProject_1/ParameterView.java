package toyProject_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Object;
public class ParameterView {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String vip = "VIP";
        String vvip = "VVIP";
        String general = "GENERAL";
        Parameter e = new Parameter(10,100);
        if(str.equals(general)){
            sb.append("GroupType : ").append(general).append("\n").append("Parameter").append("null");
        } else if (str.equals(vip)) {
            sb.append("GroupType : ").append(vip).append("\n").append("Parameter").append("null");

        } else if (str.equals(vvip)) {
            sb.append("GroupType : ").append(vvip).append("\n").append("Parameter").append("null");
        }
        System.out.println(sb);
        e.viewParameterData();
    }
}


/*
필요한 것 파라미터를 불러오는 것, 그룹과 연결지을 것
상호연관 groupClass-Parameter
 */
