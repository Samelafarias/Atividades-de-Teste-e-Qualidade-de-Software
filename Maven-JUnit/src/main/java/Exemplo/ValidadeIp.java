package Exemplo;

import java.util.regex.Pattern;

public class ValidadeIp {

    private static final String IPV4_PATTERN = 
        "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        
    public boolean validade(String ip) {
        if(ip == null){
            return false;
        }

        return ip.matches(IPV4_PATTERN);
    }
}
