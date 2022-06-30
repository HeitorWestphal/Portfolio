
#include <Ultrasonic.h>
 
//Define os pinos para o trigger e echo
#define pino_trigger 4
#define pino_echo 5
 
//Inicializa o sensor nos pinos definidos acima
Ultrasonic ultrasonic(pino_trigger, pino_echo);
 
void setup()
{
  Serial.begin(9600);
  Serial.println("Lendo dados do sensor...");
  pinMode(9,OUTPUT);
  pinMode(8,OUTPUT);
}
 
void loop(){
  
  //Le as informacoes do sensor, em cm e pol
  float cmMsec;
  long microsec = ultrasonic.timing();
  cmMsec = ultrasonic.convert(microsec, Ultrasonic::CM);
  //Exibe informacoes no serial monitor
  Serial.print("Distancia em cm: ");
  Serial.println(cmMsec);
  delay(1000);
  
  if (cmMsec < 10) {
  tone(9,261);      
 digitalWrite(8,HIGH);
  

}
 else {
 noTone(9); 
 digitalWrite(8,LOW);
}
}
