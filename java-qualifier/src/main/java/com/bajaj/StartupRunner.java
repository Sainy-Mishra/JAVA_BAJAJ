@Component
public class StartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("✅ StartupRunner is working!");
    }
}
