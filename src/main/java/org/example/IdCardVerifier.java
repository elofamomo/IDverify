package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class IDcard {

  private String id;
  private String provinceName;
  private String sexCode;
  private String yearOfBirth;

  private final Map<String, String> idDict = new HashMap<>() {
    {
      // Add province code and name to the dictionary
      idDict.put("001", "Hà Nội");
      idDict.put("002", "Hà Giang");
      idDict.put("003", "Cao Bằng");
      idDict.put("004", "Lạng Sơn");
      idDict.put("005", "Quảng Ninh");
      idDict.put("006", "Bắc Giang");
      idDict.put("007", "Bắc Kạn");
      idDict.put("008", "Tuyên Quang");
      idDict.put("009", "Lào Cai");
      idDict.put("010", "Yên Bái");
      idDict.put("011", "Thái Nguyên");
      idDict.put("012", "Lạng Sơn");
      idDict.put("013", "Bắc Ninh");
      idDict.put("014", "Hải Dương");
      idDict.put("015", "Hải Phòng");
      idDict.put("016", "Hưng Yên");
      idDict.put("017", "Thái Bình");
      idDict.put("018", "Hà Nam");
      idDict.put("019", "Nam Định");
      idDict.put("020", "Ninh Bình");
      idDict.put("021", "Thanh Hóa");
      idDict.put("022", "Nghệ An");
      idDict.put("023", "Hà Tĩnh");
      idDict.put("024", "Quảng Bình");
      idDict.put("025", "Quảng Trị");
      idDict.put("026", "Thừa Thiên Huế");
      idDict.put("027", "Đà Nẵng");
      idDict.put("028", "Quảng Nam");
      idDict.put("029", "Quảng Ngãi");
      idDict.put("030", "Bình Định");
      idDict.put("031", "Phú Yên");
      idDict.put("032", "Khánh Hòa");
      idDict.put("033", "Ninh Thuận");
      idDict.put("034", "Bình Thuận");
      idDict.put("035", "Kon Tum");
      idDict.put("036", "Gia Lai");
      idDict.put("037", "Đắk Lắk");
      idDict.put("038", "Đắk Nông");
      idDict.put("039", "Lâm Đồng");
      idDict.put("040", "Bình Phước");
      idDict.put("041", "Tây Ninh");
      idDict.put("042", "Bình Dương");
      idDict.put("043", "Đồng Nai");
      idDict.put("044", "Bà Rịa - Vũng Tàu");
      idDict.put("045", "TP Hồ Chí Minh");
      idDict.put("046", "Long An");
      idDict.put("047", "Tiền Giang");
      idDict.put("048", "Bến Tre");
      idDict.put("049", "Trà Vinh");
      idDict.put("050", "Vĩnh Long");
      idDict.put("051", "Đồng Tháp");
      idDict.put("052", "An Giang");
      idDict.put("053", "Kiên Giang");
      idDict.put("054", "Cần Thơ");
      idDict.put("055", "Hậu Giang");
      idDict.put("056", "Sóc Trăng");
      idDict.put("057", "Bạc Liêu");
      idDict.put("058", "Cà Mau");
    }
  };


  IDcard(String id) {
    this.id = id;
  }

  public String getID() {
    return this.id;
  }

  public String getProvinceName() {
    String provinceCode = this.id.substring(0, 3);
    this.provinceName = idDict.getOrDefault(provinceCode, "Unknown");
    return this.provinceName;
  }

  public String getYearOfBirth() {
    // TODO: chua day du
    String yearOfBirthCode = this.id.substring(4, 6);
    String sexCode = this.id.substring(3, 4);
    if (sexCode.equals("0") || sexCode.equals("1")) {
      return ("19" + yearOfBirthCode);
    } else if (sexCode.equals("2") || sexCode.equals("3")) {
      return ("20" + yearOfBirthCode);
    } else {
      return "Unknown";
    }
  }

  public String getSexCode() {
//    String sexCode = id.substring(3, 4);
    char sexCode = this.id.charAt(3);
    switch (sexCode) {
      case '0':
      case '2':
        return "Nam";
      case '1':
      case '3':
        return "Nữ";
      default:
        return "Unknown";
    }
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setProvinceName(String provinceName) {

    Map<String,String > idDict = new HashMap<>();

    // Add province code and name to the dictionary
    //TODO: create a public map
    idDict.put("001", "Hà Nội");
    idDict.put("002", "Hà Giang");
    idDict.put("003", "Cao Bằng");
    idDict.put("004", "Lạng Sơn");
    idDict.put("005", "Quảng Ninh");
    idDict.put("006", "Bắc Giang");
    idDict.put("007", "Bắc Kạn");
    idDict.put("008", "Tuyên Quang");
    idDict.put("009", "Lào Cai");
    idDict.put("010", "Yên Bái");
    idDict.put("011", "Thái Nguyên");
    idDict.put("012", "Lạng Sơn");
    idDict.put("013", "Bắc Ninh");
    idDict.put("014", "Hải Dương");
    idDict.put("015", "Hải Phòng");
    idDict.put("016", "Hưng Yên");
    idDict.put("017", "Thái Bình");
    idDict.put("018", "Hà Nam");
    idDict.put("019", "Nam Định");
    idDict.put("020", "Ninh Bình");
    idDict.put("021", "Thanh Hóa");
    idDict.put("022", "Nghệ An");
    idDict.put("023", "Hà Tĩnh");
    idDict.put("024", "Quảng Bình");
    idDict.put("025", "Quảng Trị");
    idDict.put("026", "Thừa Thiên Huế");
    idDict.put("027", "Đà Nẵng");
    idDict.put("028", "Quảng Nam");
    idDict.put("029", "Quảng Ngãi");
    idDict.put("030", "Bình Định");
    idDict.put("031", "Phú Yên");
    idDict.put("032", "Khánh Hòa");
    idDict.put("033", "Ninh Thuận");
    idDict.put("034", "Bình Thuận");
    idDict.put("035", "Kon Tum");
    idDict.put("036", "Gia Lai");
    idDict.put("037", "Đắk Lắk");
    idDict.put("038", "Đắk Nông");
    idDict.put("039", "Lâm Đồng");
    idDict.put("040", "Bình Phước");
    idDict.put("041", "Tây Ninh");
    idDict.put("042", "Bình Dương");
    idDict.put("043", "Đồng Nai");
    idDict.put("044", "Bà Rịa - Vũng Tàu");
    idDict.put("045", "TP Hồ Chí Minh");
    idDict.put("046", "Long An");
    idDict.put("047", "Tiền Giang");
    idDict.put("048", "Bến Tre");
    idDict.put("049", "Trà Vinh");
    idDict.put("050", "Vĩnh Long");
    idDict.put("051", "Đồng Tháp");
    idDict.put("052", "An Giang");
    idDict.put("053", "Kiên Giang");
    idDict.put("054", "Cần Thơ");
    idDict.put("055", "Hậu Giang");
    idDict.put("056", "Sóc Trăng");
    idDict.put("057", "Bạc Liêu");
    idDict.put("058", "Cà Mau");

    String newProvinceCode;

    for (String i : idDict.keySet()) {
      if (idDict.get(i).equals(provinceName)) {
        newProvinceCode = i;
        this.provinceName = provinceName;
        this.id.substring(0, 2).replace(this.id.substring(0, 2), newProvinceCode);
        break;
      } else {
        System.out.println("Your province is not available.");
      }
    }
  }


}

public class   IdCardVerifier {

  public static void main(String[] args) {
    // generate a random token
    boolean isTokenValid = checkToken();

    if (isTokenValid) {
      // get id from the user
      Scanner idInputRecieved = new Scanner(System.in);
      String id = idInputRecieved.next();
      if (isValidId(id)) {
        IDcard idInput = new IDcard(id);

        System.out.println("Province: " + idInput.getProvinceName());
        System.out.println("Gender: " + idInput.getSexCode());
        System.out.println("Year of birth: " + idInput.getYearOfBirth());

        askRequest();

        noRequestElse:
        while (true) {
          int request = inputAndCheckRequest(4);
          switch (request) {
            case 0:
              System.out.println("Thank you for using our service");
              break noRequestElse;
            case 1:
              firstRequestProcess(idInput);
              break;
            case 2:


          }

        }
      } else {
        System.out.println("Your ID is Invalid");
      }


    }
  }

  public static void firstRequestProcess(IDcard idInput) {
    System.out.println("Please enter your new ID number:");
    Scanner newIdInputRecieved = new Scanner(System.in);
    String newID = newIdInputRecieved.next();
    if (isValidId(newID)) {
      idInput.setId(newID);
      System.out.println("Your new ID number is: " + newID);
      System.out.println("Your province now is: " + idInput.getProvinceName());
      System.out.println("Your gender now is: " + idInput.getSexCode());
      System.out.println("Your year of birth now is: " + idInput.getYearOfBirth());
    } else {
      System.out.println("Your ID is Invalid");
    }
  }

  public static void sencondRequestProcess(IDcard idInput) {
    System.out.println("Please enter your new province name:");
    Scanner newProvinceInputRecieved = new Scanner(System.in);
    String newProvince = newProvinceInputRecieved.next();

    idInput.setProvinceName(newProvince);
    System.out.println("Your ID number now is: " + idInput.getID());
    System.out.println("Your new province is: " + idInput.getProvinceName());
    System.out.println("Your gender now is: " + idInput.getSexCode());
    System.out.println("Your year of birth now is: " + idInput.getYearOfBirth());

  }

  public static void askRequest() {
    System.out.println("Do you want to change your information?");
    System.out.println("0 - No, I don't want to change anything");
    System.out.println("1 - I want to change my ID number");
    System.out.println("2 - I want to change my province information");
    System.out.println("3 - I want to change my gender information");
    System.out.println("4 - I want to change my year of birth information");
  }

  public static int inputAndCheckRequest(int length) {
    Scanner requestInputRecieved = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      // TODO: merge two flow into one statement
      String infoChange = requestInputRecieved.next();
//      char c = infoChange.charAt(0);
//      if ('0' <= c && c <= '4') {
//        return c - '0';
//      } else {
//        return -1;
//      }

      if (!Character.isDigit(infoChange.charAt(0))) {
        System.out.println("Invalid request, Please enter a number from 0 to 4");
      } else if (Integer.parseInt(infoChange) > 4) {
        // Let user re-enter the information if the input is not a number or the number is not in the range
        System.out.println("Invalid request, Please enter a number from 0 to 4");
      } else {
        return Integer.parseInt(infoChange);
      }
    }
    return 0;
  }
  // checking the input token 6 times

  public static boolean checkToken() {
    String token = generateRandomString(6);
    System.out.println("Your token is: " + token);
    System.out.println("Please enter your token:");
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      String number = input.next();
      if (number.equals(token)) {
        System.out.println("Welcome, please enter your ID:");
        return true;

      } else {
        System.out.println("Wrong code, please try again");
      }
    }
    // if the token wrong 6 times, generate new token and start again
    System.out.println(" Token wrong 6 times, please start again");
    checkToken();
    input.close();

    return false;
  }

  /**
   * Generate a random token using the Random class
   *
   * @param length
   * @return
   */
  public static String generateRandomString(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    String randomString = "";
    Random random = new Random();
    char[] text = new char[length];
    // create text array with random characters
    for (int i = 0; i < length; i++) {
      text[i] = characters.charAt(random.nextInt(characters.length()));
    }
    // convert text array to string
    for (int i = 0; i < text.length; i++) {
      randomString += text[i];
    }
    return randomString;
  }

  /**
   * @param id
   * @return
   */
  public static boolean isValidId(String id) {
    if (id == null) {
      return false;
    }

    if (id.length() != 12) {
      return false;
    }

    for (int i = 0; i < id.length(); i++) {
      if (!Character.isDigit(id.charAt(i))) {
        return false;
      }
    }
    return Integer.parseInt(id.substring(0, 3)) <= 58 && Integer.parseInt(id.substring(0, 3)) >= 1
        &&
        Integer.parseInt(id.substring(3, 4)) <= 3 && Integer.parseInt(id.substring(3, 4)) >= 0;
  }


}



