import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  TODO : comment 
 * 
 * 
 * @author Julien RAMAKERS <julien.ramakers@student.ulg.ac.be>
 * @author Pierre-Yves Derbaix <pyderbaix@student.ulg.ac.be>
 * @date May 10, 2013
 * @version 1.0
 */
public class Shower {
	private ArrayList<Female> ListFemales; // : structure de données pas adaptée 
	private ArrayList<Male> ListMales; // : structure de données pas adaptée
	Lock mutexFemale = new ReentrantLock(); 
	Lock mutexMale = new ReentrantLock(); 

	/**
	 * Class constructor Shower.
	 */
	public Shower() {
		ListFemales = new ArrayList<Female>(); 
		ListMales = new ArrayList<Male>(); 
	}

	/**
	 * This function allows you to get a woman in the shower. 
	 */
	public void enterFemale() throws InterruptedException {
		mutexMale.lock();
	}

	/**
	 * This function allows you to make a woman out of the shower. 
	 */
	public void leaveFemale() {
		mutexMale.unlock(); 
	}

	/**
	 * This function allows you to get a man in the shower. 
	 */
	public void enterMale() throws InterruptedException {	
		mutexFemale.lock();
	}

	/**
	 * This function allows you to make a man out of the shower.
	 */
	public void leaveMale() {
		mutexFemale.unlock(); 
	}

	/**
	 * This function allows an individual once in the shower 
	 * to wash in the specified time.
	 * 
	 * @param time an integer representing the time that 
	 * 		  an individual has to wash.
	 */
	public void have(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//TODO : comment
	public ArrayList<Female> getListFemales() {
		return ListFemales;
	}

	//TODO : comment 
	public void setListFemales(ArrayList<Female> listFemales) {
		ListFemales = listFemales;
	}

	//TODO : comment
	public ArrayList<Male> getListMales() {
		return ListMales;
	}

	//TODO : comment
	public void setListMales(ArrayList<Male> listMales) {
		ListMales = listMales;
	}

}
