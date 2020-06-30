package net.javaguides.springboot.websocket.service;

import net.javaguides.springboot.websocket.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class LoadService
{
   @Autowired
   private SimpMessagingTemplate simpMessagingTemplate;

   public void getLoad()
         throws InterruptedException
   {
      for(int i =1; i<10; i++)
      {
         Thread.sleep(1000); // simulated delay
         Greeting greeting = new Greeting( Math.random(), Math.random() );
         greeting.setLoad( "Load "+1 );
         simpMessagingTemplate.convertAndSend( "/topic/greetings", greeting );
      }

   }
}
