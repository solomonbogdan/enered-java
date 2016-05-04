package ro.enered.exemple;

public class Student {
	String nume;
    int grup;
    int ore;
    public String invata(String numeCurs, int ore){
    	String rezultat = "Studentul "+ nume + " din grupa " + grup + " a invatat " + numeCurs + " timp de "+ ore + " ore";
    	return  rezultat;
    }

}
