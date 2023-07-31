package taho.oliokurssi.harjoitustyo;

import java.util.ArrayList;

public abstract class Storage implements AllLists {

    //private ArrayList<Lutemon> lutemons = new ArrayList<>();

    // Tehdään metodi abstraktiksi, jotta aliluokat toteuttavat sen
    public abstract ArrayList<Lutemon> getList();


}





//   public static Storage getInstance() {
//       if(storage == null) {
//           storage = new Storage();
//       }
//       return storage;
//   }

   // public ArrayList<Lutemon> getLutemons() {
        
  //      return lutemons;
  //  }
//
  //  public void addLutemon(Lutemon lutemon) {
  //
  //      lutemons.add(lutemon);
  //      System.out.print("Örkki lisätty");
  //  }
