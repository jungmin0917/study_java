package ex1_enum;

public enum Transportation {
//	BUS(100), TRAIN(150), SHIP(200), AIRPLANE(250);
	
	BUS(100){
		@Override
		int totalFare(int distance) {
			return distance * this.fare;
		}
	},
	TRAIN(150){
		@Override
		int totalFare(int distance) {
			return distance * this.fare;
		}
	},
	SHIP(200){
		@Override
		int totalFare(int distance) {
			return distance * this.fare;
		}
	},
	AIRPLANE(250){
		@Override
		int totalFare(int distance) {
			return distance * this.fare;
		}
	};
	
	protected int fare;

	private Transportation(int fare) {
		this.fare = fare;
	}
	
	abstract int totalFare(int distance);
}

