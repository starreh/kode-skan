import reports.ReportGenerator;
import exception.ReportException;

import java.util.Scanner;

public class KodeScan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Enter File or Directory Path : ");
            String path = scanner.nextLine().trim();

            System.out.println("Select Report Format ? .txt, .json, .csv : ");
            String format = scanner.nextLine().trim().toLowerCase();

            ReportGenerator reportGenerator = new ReportGenerator();
            reportGenerator.generateReport(path, format);

        } catch (ReportException e) {
            System.err.println("[Exception] Report : " + e.getMessage());

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
