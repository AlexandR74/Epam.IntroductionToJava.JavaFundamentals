package java.by.epam.learn.main.switch_operator;

public class LearnainSwitch {
    public static void main(String[] args) {

        byte value =0; //short, int, char, String, enum

        final byte RANGE = 127;

        switch (value) {
            case 4: // more code 1;
                break;
            case RANGE: //more code 2;
                break;
            case 0: // more code 3;
                    break;
                    default: // more code 4

        }

    }
    public static int difeneLevel (String role){
        int level;
        switch (role) { // role.toLowerCase()
            case "guest":  level = 0;
            break;
            default: throw new IllegalArgumentException("non-autentic role");
            }
            return level;
    }
}
