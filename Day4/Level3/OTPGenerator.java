
public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a 6-digit number
    }

    // Method to ensure the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // If any OTP is repeated, return false
                }
            }
        }
        return true; // Return true if all OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate if the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}

