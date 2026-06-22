public class DecoratorPatternTest {
    public static void main(String[] args) {
        System.out.println("\n Email Notification");
        System.out.println();
        Notifier emailNotifier = new EmailNotifier();
        System.out.println();

        emailNotifier.send("System update Available");
        System.out.println();
        System.out.println("\n Email + SMS Notification: ");
        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println();
        smsNotifier.send("System Update Available");
        System.out.println();


        Notifier fullNotifier = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()
                                    )
                                );
        
        fullNotifier.send("\n System Update Available");
    }    
}
