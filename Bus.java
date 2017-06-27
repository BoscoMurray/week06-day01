public class Bus {

  private int number;
  private Person[] passengers;

  public Bus(int number) {
    this.number = number;
    this.passengers = new Person[10];
  }

  public int getNumber() {
    return this.number;
  }

  public int passengerCount() {
    int numberOfPassengers = 0;

    for (Person person : this.passengers) {
      if (person != null) {
        numberOfPassengers++;
      }
    }

    return numberOfPassengers;
  }

  public boolean isBusFull() {
    return passengerCount() == this.passengers.length;
  }

  public void add(Person person) {
    if (isBusFull()) {
      return;
    }
    int index = passengerCount();
    this.passengers[index] = person;
  }

}