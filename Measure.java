import java.util.ArrayList;
import java.util.List;
import static mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		
		List<Measurement> measurements = new ArrayList<Measurement>();
		long startTime;
		for(int i =0; i<toRun.length; i++)
		{
			for(int j = startN; j<=stopN; j++){
				startTime = System.nanoTime();
				switch (toRun[i]){
					case "A":
						mysteryA(j);
						break;
					case "B":
						mysteryB(j);
						break;
					case "C":
						mysteryC(j);
						break;
					case "D":
						mysteryD(j);
						break;
					case "E":
						mysteryE(j);
						break;
					default:
						mysteryF(j);
						break;
				}
				measurements.add(new Measurement(toRun[i], j, System.nanoTime()-startTime));
			}
		}
		return measurements;
	}


	public static String measurementsToCSV(List<Measurement> toConvert) {
		String toReturn = "name,n,nanoseconds\n";
		for(int i = 0; i<toConvert.size(); i++){
			toReturn = toReturn+toConvert.get(i).name+","+toConvert.get(i).valueOfN+","+toConvert.get(i).nanosecondsToRun+"\n";
		}
		return toReturn;

	}

	/* Add any helper methods you find useful */

}
