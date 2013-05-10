
/**
 * This class implements protocol between men and women and 
 * people of opposite sex ever occupy the shower at the same time.
 * 
 * @author Julien RAMAKERS <julien.ramakers@student.ulg.ac.be>
 * @author Pierre-Yves Derbaix <pyderbaix@student.ulg.ac.be>
 * @date May 10, 2013
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shower showerRoom = new Shower();

		showerRoom.getListMales().add(new Male());
		showerRoom.getListMales().add(new Male());
		showerRoom.getListFemales().add(new Female());


	}

}
