public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }
}