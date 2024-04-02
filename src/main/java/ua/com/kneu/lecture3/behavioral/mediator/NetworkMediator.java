package ua.com.kneu.lecture3.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class NetworkMediator implements Mediator {

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
      colleagues.add(colleague);
      for(Colleague c: colleagues){
          if(c!=colleague){
              c.receiveRegNotification(colleague);
          }
      }
    }

    @Override
    public void unregister(Colleague colleague) {
        colleagues.remove(colleague);
        for(Colleague c : colleagues){
            c.receiveUnRegNotification(colleague);
        }
    }
}
