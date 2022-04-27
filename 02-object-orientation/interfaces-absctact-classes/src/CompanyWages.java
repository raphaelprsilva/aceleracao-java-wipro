public class CompanyWages {
  public double totalWages(Developer[] developers) {
    double sum = 0.0;

    for (Developer developer : developers) {
      sum += developer.wage();
    }

    return sum;
  }
}
