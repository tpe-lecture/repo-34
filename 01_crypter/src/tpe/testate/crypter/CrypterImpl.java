package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		String result = "";
		input = input.toLowerCase();
		int stringLength = input.length();
		char array[] = new char[stringLength];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.charAt(i);
		}
		for (int i = 0; i < array.length; i++) {
			char actualchar = array[i];

			switch (actualchar) {
			case 'e':
				array[i] = '3';
				break;
			case '3':
				array[i] = 'e';
				break;
			case 'l':
				array[i] = '1';
				break;
			case '1':
				array[i] = 'l';
				break;
			case 'o':
				array[i] = '0';
				break;
			case '0':
				array[i] = 'o';
				break;
			case 'a':
				array[i] = '4';
				break;
			case '4':
				array[i] = 'a';
				break;
			case 't':
				array[i] = '7';
				break;
			case '7':
				array[i] = 't';
				break;

			default:
				break;
			}

		}
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		return result;

	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		int stringLenght = input.length();

		for (int i = 0; i < stringLenght; i++) {

			if (input.charAt(i) >= 48 & input.charAt(i) <= 122) {

			} else {

				throw new IllegalArgumentException();
			}
			if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
				throw new IllegalArgumentException();
			}

		}

		String result;
		result = encrypt(input);

		return result;
	}

}
