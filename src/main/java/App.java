import java.util.Scanner;
public class App {

    public static void main(String[] args)
    {
        //System.out.println("Would you like to update your schedule (Enter 1)");
        //while(){}
        //System.out.println("Would you like to update your schedule (Enter 1)");



        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to add to your schedule?");
        String reminder = scan.nextLine();

        System.out.println("What month is this happening");
        String  month = scan.nextLine();

        System.out.println("What day is this happening");
        int day = scan.nextInt();

        Day day1 = new Day(month, day);
        Reminder reminder1 = new Reminder(reminder);
        day1.addReminder(reminder1);
        System.out.println(day1);
        ScheduleBot bot = new ScheduleBot();
        bot.addDay(day1);

        Day day2 = new Day(month, day);
        Reminder reminder2 = new Reminder(reminder);
        day2.addReminder(reminder2);
        System.out.println(day2);
        bot.addDay(day2);

        //Goals: Ask the user what their reminders are, and for what days.
        //Then either add or update those days with the new tasks.

        //Then: Teach your bot to print out a nice schedule.

        //Even later: Your bot can talk about today.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("What would you like to add to your schedule?");
//        String planDetails = scan.nextLine();
//        System.out.println("What month is this happening");
//        String planMonth = scan.nextLine();
//        System.out.println("What day of the month?");
//        String planDay = scan.nextLine();
//        ScheduleBot Plan1 = new ScheduleBot(planDetails, planMonth, planDay);
//        System.out.println(pla);



    }
}
