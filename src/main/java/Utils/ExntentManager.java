package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExntentManager {

	  private static ExtentReports extent;

	    public static ExtentReports getInstance() {
	        if (extent == null) {
	            extent = new ExtentReports();
	            // Configure the HTML reporter
	            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/SparkReport/Spark.html");
	            extent.attachReporter(htmlReporter);
	        }
	        return extent;
	    }
	}
