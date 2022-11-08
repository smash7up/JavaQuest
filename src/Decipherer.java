public class Decipherer {
    public static String decode(String message) {
        double stringLength = message.length()/2;
        String substring = message.substring(5, (int) (5 + stringLength));
        String replaceString = substring.replaceAll("@#\\?", " ");
        StringBuilder sb = new StringBuilder(replaceString);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("0@sn9sirppa@#?ia'jgtvryko1") + " " + decode("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj") + " " + decode("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}
