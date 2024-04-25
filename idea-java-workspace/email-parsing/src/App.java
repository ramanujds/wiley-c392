public class App {
    public static void main(String[] args) throws Exception {
        EmailPaser emailPaser=new EmailPaser();
        emailPaser.parseEmails();
        emailPaser.displayEmailDomains();

    }
}
