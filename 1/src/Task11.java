public class Task11 {
    public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";

    public static String encrypt(String text, int shift) {
        // code here...
        String result = "";

        for(int i=0;i<text.length();i++) {
            if (text.charAt(i)>64 && text.charAt(i)<91 || text.charAt(i)>96 && text.charAt(i)<123) {
                result +=  (char)(text.charAt(i) + shift);
            } else result +=  (char)text.charAt(i);
        }
        return result;
    }

    public static String decrypt(String text, int shift) {
        // code here...
        String result = "";

        for(int i=0;i<text.length();i++) {
            if (text.charAt(i)==95 || text.charAt(i)<64) {
                result +=  (char)text.charAt(i);
            } else result += (char)(text.charAt(i) - shift);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
        System.out.println(decrypt(encrypt(text, 5), 5));
    }
}
