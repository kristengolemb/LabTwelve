
public enum c {
	ROCK {
		@Override
	    public String toString() {
	      return "rock";
	    } },

	PAPER

	{
		@Override
		    public String toString() {
		    return "paper";
	} },

	SCISSORS

	{
		@Override
		public String toString() {
			return "scissors";
		}

	},
}
// toString method that converts selected value to a string