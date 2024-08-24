package Ab.Abstract;

public interface Transport {
    //interface members are public and abstract by default:
//    we make abstract so that the particular function or class could be mandatory for perform it is like a contract must do.
// in abstract method some function may be contract base:

      void setGetGo();
      static void charge()
      {
          System.out.println("Phone will have to charge..");
      }

}
