public class Main {
    public static void main(String[] args) {
		String[] s = {"A","B", "C", "D", "E", "F"};
        System.out.print(Measure.measurementsToCSV(Measure.measure(s, 0, 100)));
    }
}
