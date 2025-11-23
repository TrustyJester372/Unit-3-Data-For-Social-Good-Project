public class DataRunner {
    public static void main(String[] args) {
        UserStory a = new UserStory("names.txt", "weight.txt", "intelligence.txt", "geological.txt");
        Prompter p = new Prompter(a); 
        p.start();
    }
}