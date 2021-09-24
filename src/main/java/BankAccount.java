import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Random;

class AccountManagement{ 
	String str3;
	String str2 = ".txt";
	int  acc,acctype,acc1,dep,notrans;
	int free = 0;
	String nam, mail, adr,stracc,strtype,time,strdep,strfree;
	Random random = new Random();
	int rn = random.nextInt(1000000);
	String email,name,address,str,accType;
	int temp, tempdeposit,getamount,tempWithdraw;
	Scanner in = new Scanner(System.in);
	//___________________________________________________________Copying two files__________________________
	void file_copy_1() {
		try {
			BufferedWriter  bw = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedReader tmp = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\AccountsManagement.txt"));
			String t;
			while((t= tmp.readLine()) != null) {
				bw.write(t + "\n");
				//System.out.println(t + "/n");
			}
			bw.close();
			tmp.close();
				
		}
		catch (Exception ex) {
			return ;
		}
	}

	void file_copy_2() {
		try {
			BufferedWriter  bw = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\AccountsManagement.txt"));
			BufferedReader tmp = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
			String t;
			while((t= tmp.readLine()) != null) {
				bw.write(t + "\n");
				//System.out.println(t + "/n");
			}
			bw.close();
			tmp.close();
				
		}
		catch (Exception ex) {
			return ;
		}
	}

	//_______________________________________________________________function to deposit amount
	int makeDeposit(int accNumber) {
		file_copy_1();
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7,temp_ded,dp,str1;
		int temp1, temp2,temp3,temp4;
		int returnval = 1;
		int tempAmn;
		System.out.println("Account: "+ accNumber + "\n");
		System.out.println("Enter the amount to deposit: ");
		tempAmn =  in.nextInt();
		String str2 = ".txt";
		String store1 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		String str4 = "-Deductions.txt";
		try {
			BufferedReader ne = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedWriter  be = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
			String sre,pl;
			System.out.println("found the account" + "\n");
			pl = String.valueOf(accNumber);
			while((sre = ne.readLine()) != null) {
				temp1 = Integer.valueOf(sre);
				tmp1 = ne.readLine();
				temp2 = Integer.valueOf(tmp1);
				tmp2 = ne.readLine();
				temp3 = Integer.valueOf(tmp2);
				tmp3 = ne.readLine();
				tmp4 = ne.readLine();
				tmp5 = ne.readLine();
				tmp6 = ne.readLine();
				tmp7 = ne.readLine();
				temp4 = Integer.valueOf(tmp7);
				str3 = sre.concat(str2);
				str1 = store1.concat(str3);
				dp = sre.concat(str4);
				temp_ded = store1.concat(dp);
				if(temp1 == accNumber) {
					System.out.println("Enter the amount to deposit: ");
					System.out.println("found the account" + "\n");
					if(temp2 == 1) {
						if(temp3 < 3) {
							temp4 = temp4 + tempAmn;
							temp3 = temp3 + 1;
							FileWriter fstream = new FileWriter(str1,true);
							  BufferedWriter wr = new BufferedWriter(fstream);
							  returnval = temp4;
							  wr.write(tempAmn + " amount deposited at " + new java.util.Date()+"\n");
							  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
							  
							  wr.close();
						}
						else if(temp3 > 2){
							temp4 = temp4 + tempAmn;
							temp3 = temp3 + 1;
							FileWriter fstream = new FileWriter(str1,true);
							  BufferedWriter wr = new BufferedWriter(fstream);
							  returnval = temp4;
							  wr.write(tempAmn + " amount deposited at " + new java.util.Date()+"\n");
							  wr.write("Tax on deposit was 10 at" + new java.util.Date()+"\n");
							  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
							  wr.close();
							  System.out.println("Enter the amount to deposit: ");
							  FileWriter ded = new FileWriter(temp_ded,true);
							  BufferedWriter dd = new BufferedWriter(ded);
							  dd.write("Tax on this depositing transaction is 10 at" + new java.util.Date()+"\n");
							  dd.write("RS: 10" + "\n");
							  dd.close();
						}
					}
					else if(temp2 == 2) {
						temp4 = temp4 + tempAmn;
						FileWriter fstream = new FileWriter(str3,true);
						  BufferedWriter wr = new BufferedWriter(fstream);
						  returnval = temp4;
						  wr.write(tempAmn + " amount deposited at " + new java.util.Date()+"\n");
						  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
						  wr.close();
					}
				}
				be.write(sre + "\n");
				be.write(tmp1 + "\n");
				be.write(temp3 + "\n");
				be.write(tmp3 + "\n");
				be.write(tmp4 + "\n");
				be.write(tmp5 + "\n");
				be.write(tmp6 + "\n");
				be.write(temp4 + "\n");
			}
			be.close();
			ne.close();
			file_copy_2();
			System.out.println(returnval + "\n");
			
		}catch(Exception ex) {
			System.out.println(returnval + "\n");
			return returnval;
		}
		
		return returnval;
	}
	//________________________________________________________________function to withdraw amount
	
	int makeWithdrawal(int accNumber) {
		int returnval = 0;
		file_copy_1();
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7,str1,ss,store2,dp,temp_ded;
		int temp1, temp2,temp3,temp4,temp5;
		int tempAmn;
		System.out.println("Enter the amount to withdraw: ");
		tempAmn =  in.nextInt();
		String str2 = ".txt";
		String pl;
		String store1 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		String str4 = "-Deductions.txt";
		try {
			BufferedReader ne = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedWriter  be = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
			String s;
			while((s = ne.readLine()) != null) {
				temp1 = Integer.valueOf(s);
				tmp1 = ne.readLine();
				temp2 = Integer.valueOf(tmp1);
				tmp2 = ne.readLine();
				temp3 = Integer.valueOf(tmp2);
				tmp3 = ne.readLine();
				tmp4 = ne.readLine();
				tmp5 = ne.readLine();
				tmp6 = ne.readLine();
				tmp7 = ne.readLine();
				temp4 = Integer.valueOf(tmp7);
				str3 = s.concat(str2);
				str1 = store1.concat(str3);
				dp = s.concat(str4);
				temp_ded = store1.concat(dp);
				if(temp1 == accNumber) {
					if(temp2 == 1) {
						if(temp4 > tempAmn - 1) {
							if(temp3 < 3) {
								temp4 = temp4 - tempAmn;
								temp3 = temp3 + 1;
								FileWriter fstream = new FileWriter(str3,true);
								returnval = temp4;
								  BufferedWriter wr = new BufferedWriter(fstream);
								  wr.write(tempAmn + " amount withdrawn at " + new java.util.Date()+"\n");
								  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
								  //System.out.println("Enter the amount to deposit: ");
								  wr.close();
							}
							else {
								temp4 = temp4 - tempAmn;
								temp3 = temp3 + 1;
								returnval = temp4;
								FileWriter fstream = new FileWriter(str3,true);
								  BufferedWriter wr = new BufferedWriter(fstream);
								  wr.write(tempAmn + " amount withdrawn at " + new java.util.Date()+"\n");
								  wr.write("Tax on withdraw was 10 at" + new java.util.Date()+"\n");
								  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
								  wr.close();
								  FileWriter ded = new FileWriter(temp_ded,true);
								  BufferedWriter dd = new BufferedWriter(ded);
								  dd.write("Tax on this withdraw transaction is 10 at" + new java.util.Date()+"\n");
								  dd.write("RS: 10" + "\n");
								  dd.close();
							}
						}
						else if(temp4 < tempAmn && (temp4-tempAmn)*-1 < 5000) {
							if(temp3 < 3) {
								temp4 = temp4 - tempAmn;
								temp4 = temp4 + 5000;
								temp3 = temp3 + 1;
								returnval = temp4;
								System.out.println(returnval + "\n");
								FileWriter fstream = new FileWriter(str3,true);
								  BufferedWriter wr = new BufferedWriter(fstream);
								  wr.write(tempAmn + "amount withdrawn at " + new java.util.Date()+"\n");
								  wr.write("Amount 5000 was added before withdrawal at: " + new java.util.Date()+"\n");
								  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
								  wr.close();
							}
							else {
								temp4 = temp4 - tempAmn;
								temp4 = temp4 + 5000;
								temp3 = temp3 + 1;
								returnval = temp4;
								System.out.println(returnval + "\n");
								FileWriter fstream = new FileWriter(str3,true);
								  BufferedWriter wr = new BufferedWriter(fstream);
								  wr.write(tempAmn + "amount withdrawn at " + new java.util.Date()+"\n");
								  wr.write("Amount 5000 was added before withdrawal at: " + new java.util.Date()+"\n");
								  wr.write("Tax on withdraw was 10 at" + new java.util.Date()+"\n");
								  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
								  wr.close();
								  FileWriter ded = new FileWriter(temp_ded,true);
								  BufferedWriter dd = new BufferedWriter(ded);
								  dd.write("Tax on this withdraw transaction is 10 at" + new java.util.Date()+"\n");
								  dd.write("RS: 10" + "\n");
								  dd.close();
							}
						}
					}
					else if(temp2 == 2) {
						if(temp4 > tempAmn - 1) {
							temp4 = temp4 - tempAmn;
							returnval = temp4;
							FileWriter fstream = new FileWriter(str3,true);
							  BufferedWriter wr = new BufferedWriter(fstream);
							  wr.write(tempAmn + " amount withdrawn at " + new java.util.Date()+"\n");
							  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
							  wr.close();
						}
					}
				}
				be.write(s + "\n");
				be.write(tmp1 + "\n");
				be.write(temp3 + "\n");
				be.write(tmp3 + "\n");
				be.write(tmp4 + "\n");
				be.write(tmp5 + "\n");
				be.write(tmp6 + "\n");
				be.write(temp4 + "\n");
				//returnval = temp4;
			}
			ne.close();
			be.close();
			file_copy_2();
		}catch(Exception ex) {
			return 0;
		}
		return returnval;
	}
	//_______________________________________________________________Display name and amount
	boolean checkBalance(int acc) {
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7;
		int temp1;
		boolean tempvar = false;
		try {
				BufferedReader ne = new BufferedReader(
						new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
				BufferedWriter  be = new BufferedWriter(
						new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
				String s;
				while((s = ne.readLine()) != null) {
					temp1 = Integer.valueOf(s);
					tmp1 = ne.readLine();
					tmp2 = ne.readLine();
					tmp3 = ne.readLine();
					tmp4 = ne.readLine();
					tmp5 = ne.readLine();
					tmp6 = ne.readLine();
					tmp7 = ne.readLine();
					if(temp1 == acc) {
						System.out.println("Name: " + tmp3 + "\n");
						System.out.println("Amount: " + tmp7 + "\n");
						tempvar = true;
					}
					be.write(s + "\n");
					be.write(tmp1 + "\n");
					be.write(tmp2 + "\n");
					be.write(tmp3 + "\n");
					be.write(tmp4 + "\n");
					be.write(tmp5 + "\n");
					be.write(tmp6 + "\n");
					be.write(tmp7 + "\n");
				}
			be.close();
			ne.close();
			file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	//____________________________________________________________________
	boolean printStatement(int acc) {
		String tmp9,tmp0;
		String tmp11 = ".txt";
		String tmp12 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		String tmp2,tmp3,tmp4,tmp5,tmp6,tmp7,tmp8;
		int temp1,temp2;
		boolean tempvar = false;
		String z;
		try {
			BufferedReader ne = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedWriter  be = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
			String s;
			while((s = ne.readLine()) != null) {
					temp1 = Integer.valueOf(s);
					tmp2 = ne.readLine();
					temp2 = Integer.valueOf(tmp2);
					tmp3 = ne.readLine();
					tmp4 = ne.readLine();
					tmp5 = ne.readLine();
					tmp6 = ne.readLine();
					tmp7 = ne.readLine();
					tmp8 = ne.readLine();
					tmp0 = s.concat(tmp11);
					tmp9 = tmp12.concat(tmp0);
					BufferedReader xe = new BufferedReader(
							new FileReader(tmp9));
					if(temp1 == acc) {
						System.out.println("Account Number " + s );
						if(temp2 == 1) {
							System.out.println("Account Type: Checking Account");
						}else {
							System.out.println("Account Type: Savings Account");
						}
						System.out.println("Name: " + tmp4);
						System.out.println("Email: " + tmp5);
						System.out.println("Address: " + tmp6);
						System.out.println("Time: " + tmp7);
						System.out.println("Amount: " + tmp8);
						System.out.println("Other Transaction Details: \n");
						while((z = xe.readLine()) != null) {
							tempvar = true;
							System.out.println(z + "\n");
						}
						xe.close();
					}
					be.write(s + "\n");
					be.write(temp2 + "\n");
					be.write(tmp3 + "\n");
					be.write(tmp4 + "\n");
					be.write(tmp5 + "\n");
					be.write(tmp6 + "\n");
					be.write(tmp7 + "\n");
					be.write(tmp8 + "\n");
			}
			be.close();
			ne.close();
			file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	//______________________________________________________________________Transfer amount
	
	int transferAmount(int acc, int acc2) {
		//____________________________________________________________________________________
				String atmp1, atmp2, atmp3, atmp4, atmp5, atmp6, atmp7,dp,temp_ded,str1;
				int atemp1, atemp2,atemp3,atemp4;
				String astr2 = ".txt";
				int tempAmn;
				System.out.println("Enter the amount to transfer: ");
				tempAmn =  in.nextInt();
				String store1 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
				String str4 = "-Deductions.txt";
				int returnval = 0;
				try {
					BufferedReader ne = new BufferedReader(
							new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
					BufferedWriter  be = new BufferedWriter(
							new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
					String r;
					while((r = ne.readLine()) != null) {
						atemp1 = Integer.valueOf(r);
						atmp1 = ne.readLine();
						atemp2 = Integer.valueOf(atmp1);
						atmp2 = ne.readLine();
						atemp3 = Integer.valueOf(atmp2);
						atmp3 = ne.readLine();
						atmp4 = ne.readLine();
						atmp5 = ne.readLine();
						atmp6 = ne.readLine();
						atmp7 = ne.readLine();
						atemp4 = Integer.valueOf(atmp7);
						str3 = r.concat(astr2);
						str1 = store1.concat(str3);
						dp = r.concat(str4);
						temp_ded = store1.concat(dp);
						if(atemp1 == acc) {
							if(atemp2 == 1) {
								if(atemp4 > tempAmn - 1) {
									if(atemp3 < 3) {
										atemp4 = atemp4 - tempAmn;
										atemp3 = atemp3 + 1;
										FileWriter fstream = new FileWriter(str3,true);
										  BufferedWriter wr = new BufferedWriter(fstream);
										  wr.write(tempAmn + " amount transfered to "+ acc2 +" at " + new java.util.Date()+"\n");
										  wr.write(tempAmn + " amount deposited at " + new java.util.Date()+"\n");
										  wr.write("Total Amount is: " + atemp4 + " at the time is " + new java.util.Date()+"\n");
										  wr.close();
									}
									else {
										atemp4 = atemp4 - tempAmn;
										atemp3 = atemp3 + 1;
										FileWriter fstream = new FileWriter(str3,true);
										  BufferedWriter wr = new BufferedWriter(fstream);
										  wr.write(tempAmn + " amount transfered to "+ acc2 +" at " + new java.util.Date()+"\n");
										  wr.write("Total Amount is: " + atemp4 + " at the time is " + new java.util.Date()+"\n");
										  wr.close();
										  FileWriter ded = new FileWriter(temp_ded,true);
										  BufferedWriter dd = new BufferedWriter(ded);
										  dd.write("Tax on transfering amount transaction is 10 at" + new java.util.Date()+"\n");
										  dd.write("RS: 10" + "\n");
										  dd.close();
									}
								}
								else if(atemp4 < tempAmn) {
									System.out.println("You cannot transfer the amount due to the low balance! \n");
								}
								
							}
							else if(atemp2 == 2) {
								if(atemp4 > tempAmn - 1) {
									atemp4 = atemp4 - tempAmn;
									FileWriter fstream = new FileWriter(str3,true);
									  BufferedWriter wr = new BufferedWriter(fstream);
									  wr.write(tempAmn + " amount deposited at " + new java.util.Date()+"\n");
									  wr.write("Total Amount is: " + atemp4 + " at the time is " + new java.util.Date()+"\n");
									  wr.close();
								}
							}
						}
						be.write(r + "\n");
						be.write(atmp1 + "\n");
						be.write(atemp3 + "\n");
						be.write(atmp3 + "\n");
						be.write(atmp4 + "\n");
						be.write(atmp5 + "\n");
						be.write(atmp6 + "\n");
						be.write(atemp4 + "\n");
					}
					ne.close();
					be.close();
					file_copy_2();
				}catch(Exception ex) {
					return 0;
				}
		//_______________________________________________________________________________________________
		file_copy_1();
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7;
		int temp1, temp2,temp3,temp4;
		String str2 = ".txt";
		//String astore1 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		String astr4 = "-Deductions.txt";
		try {
			BufferedReader ne = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedWriter  be = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
			String s;
			while((s = ne.readLine()) != null) {
				temp1 = Integer.valueOf(s);
				tmp1 = ne.readLine();
				temp2 = Integer.valueOf(tmp1);
				tmp2 = ne.readLine();
				temp3 = Integer.valueOf(tmp2);
				tmp3 = ne.readLine();
				tmp4 = ne.readLine();
				tmp5 = ne.readLine();
				tmp6 = ne.readLine();
				tmp7 = ne.readLine();
				temp4 = Integer.valueOf(tmp7);
				str3 = s.concat(str2);
				str1 = store1.concat(str3);
				dp = s.concat(astr4);
				temp_ded = store1.concat(dp);
				if(temp1 == acc2) {
					if(temp2 == 1) {
						if(temp3 < 3) {
							temp4 = temp4 + tempAmn;
							temp3 = temp3 + 1;
							returnval = temp4;
							FileWriter fstream = new FileWriter(str3,true);
							  BufferedWriter wr = new BufferedWriter(fstream);
							  wr.write(tempAmn + " amount transformed from " + acc + " to your account at " + new java.util.Date()+"\n");
							  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
							  wr.close();
						}
						else {
							temp4 = temp4 + tempAmn;
							temp3 = temp3 + 1;
							returnval = temp4;
							FileWriter fstream = new FileWriter(str3,true);
							  BufferedWriter wr = new BufferedWriter(fstream);
							  wr.write(tempAmn + " amount transformed from " + acc + " to your account at " + new java.util.Date()+"\n");
							  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
							  wr.close();
							  FileWriter ded = new FileWriter(temp_ded,true);
							  BufferedWriter dd = new BufferedWriter(ded);
							  dd.write("Tax on transfering amount transaction is 10 at" + new java.util.Date()+"\n");
							  dd.write("RS: 10" + "\n");
							  dd.close();
						}
					}
					else if(temp2 == 2) {
						temp4 = temp4 + tempAmn;
						returnval = temp4;
						FileWriter fstream = new FileWriter(str3,true);
						  BufferedWriter wr = new BufferedWriter(fstream);
						  wr.write(tempAmn + " amount transformed from " + acc + " to your account at " + new java.util.Date()+"\n");
						  wr.write("Total Amount is: " + temp4 + " at the time is " + new java.util.Date()+"\n");
						  wr.close();
					}
				}
				be.write(s + "\n");
				be.write(tmp1 + "\n");
				be.write(temp3 + "\n");
				be.write(tmp3 + "\n");
				be.write(tmp4 + "\n");
				be.write(tmp5 + "\n");
				be.write(tmp6 + "\n");
				be.write(temp4 + "\n");
			}
			ne.close();
			be.close();
			file_copy_2();
		}catch(Exception ex) {
			return 0;
		}
		return returnval;
	}
	//_________________________________________________________________Calculating Zakat
	
	boolean calculateZakat(int acc) {
		boolean tempvar = false;
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7,str1,ss;
		int temp1, temp2,temp4;
		String str2 = "-Zakat.txt";
		String str3 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		try {
				BufferedReader ne = new BufferedReader(
						new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
				BufferedWriter  be = new BufferedWriter(
						new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
				String s;
				while((s = ne.readLine()) != null) {
					temp1 = Integer.valueOf(s);
					tmp1 = ne.readLine();
					temp2 = Integer.valueOf(tmp1);
					tmp2 = ne.readLine();
					tmp3 = ne.readLine();
					tmp4 = ne.readLine();
					tmp5 = ne.readLine();
					tmp6 = ne.readLine();
					tmp7 = ne.readLine();
					temp4 = Integer.valueOf(tmp7);
					str1 = s.concat(str2);
					ss = str3.concat(str1);
					if(acc == temp1) {
						if(temp2 == 2) {
							double zakat;
							zakat = (temp4*2.5)/100;
							System.out.println("Total amount is: "+ temp4);
							System.out.println("Amount of Zakat is: "+ zakat);
							FileWriter fstream = new FileWriter(ss,true);
							  BufferedWriter zk = new BufferedWriter(fstream);
							  zk.write("The amount on "+ new java.util.Date() + " is: " + temp4 +"\n");
							  zk.write("The amount of zakat is: " + zakat +"\n");
							  zk.close();
							  tempvar = true;
						}
					}
					
					be.write(s + "\n");
					be.write(tmp1 + "\n");
					be.write(tmp2 + "\n");
					be.write(tmp3 + "\n");
					be.write(tmp4 + "\n");
					be.write(tmp5 + "\n");
					be.write(tmp6 + "\n");
					be.write(temp4 + "\n");
				}
			ne.close();
			be.close();
			file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	//__________________________________________________________________________________calculating interest
	boolean calculateInterest(int acc) {
		boolean tempvar = false;
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7,str1,ss;
		int temp1, temp2,temp4;
		String str2 = "-Tax.txt";
		String str3 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		try {
				BufferedReader ne = new BufferedReader(
						new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
				BufferedWriter  be = new BufferedWriter(
						new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
				String s;
				while((s = ne.readLine()) != null) {
					temp1 = Integer.valueOf(s);
					tmp1 = ne.readLine();
					temp2 = Integer.valueOf(tmp1);
					tmp2 = ne.readLine();
					tmp3 = ne.readLine();
					tmp4 = ne.readLine();
					tmp5 = ne.readLine();
					tmp6 = ne.readLine();
					tmp7 = ne.readLine();
					temp4 = Integer.valueOf(tmp7);
					str1 = s.concat(str2);
					ss = str3.concat(str1);
					if(acc == temp1) {
						if(temp2 == 1) {
							System.out.println("printing...." + "\n");
							double intVar;
							intVar = (temp4*1)/100;
							System.out.println("Total amount is: "+ temp4);
							System.out.println("Amount of Interest is: "+ intVar);
							FileWriter fstream = new FileWriter(ss,true);
							BufferedWriter zk = new BufferedWriter(fstream);
							zk.write("The amount on "+ new java.util.Date() + " is: " + temp4 +"\n");
							zk.write("The amount of Interest is: " + intVar +"\n");
							zk.close();
							tempvar = true;
						}
					}
					be.write(s + "\n");
					be.write(tmp1 + "\n");
					be.write(tmp2 + "\n");
					be.write(tmp3 + "\n");
					be.write(tmp4 + "\n");
					be.write(tmp5 + "\n");
					be.write(tmp6 + "\n");
					be.write(temp4 + "\n");
				}
			ne.close();
			be.close();
			file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return  tempvar;
	}
	//___________________________________________________________________________Display all deductions!
	boolean displayAllDeductions(int acc) {
		boolean  tempvar = false;
		String tmp1, tmp2, tmp3, tmp4, tmp5, tmp6, tmp7,str1,ss;
		int temp1, temp2,temp3,temp4,temp5;
		String zkt_rd1,zkt_rd2;
		//String str4 = "-Tax.txt";
		String str5 = "-Deductions.txt";
		//String str2 = "-Zakat.txt";
		String str3 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		try {
				BufferedReader ne = new BufferedReader(
						new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
				BufferedWriter  be = new BufferedWriter(
						new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
				String s;
				while((s = ne.readLine()) != null) {
					temp1 = Integer.valueOf(s);
					tmp1 = ne.readLine();
					temp2 = Integer.valueOf(tmp1);
					tmp2 = ne.readLine();
					temp3 = Integer.valueOf(tmp2);
					tmp3 = ne.readLine();
					tmp4 = ne.readLine();
					tmp5 = ne.readLine();
					tmp6 = ne.readLine();
					tmp7 = ne.readLine();
					temp4 = Integer.valueOf(tmp7);
					if(acc == temp1) {
						if(temp2 == 2) {
							String str2 = "-Zakat.txt";
							str1 = s.concat(str2);
							ss = str3.concat(str1);
							//String str2 = "-Zakat.txt";
							System.out.println("Displaying all Zakat amounts...\n");
							BufferedReader zkr = new BufferedReader(
									new FileReader(ss));
							while((zkt_rd1 = zkr.readLine()) != null) {
								System.out.println(zkt_rd1 + "\n");
								tempvar = true;
						}
							zkr.close();
							
					}
						else  if(temp2 == 1) {
						String str2 = "-Tax.txt";
						str1 = s.concat(str2);
						ss = str3.concat(str1);
						System.out.println("Displaying all Interest Rates...\n");
						BufferedReader zkr = new BufferedReader(
								new FileReader(ss));
						while((zkt_rd1 = zkr.readLine()) != null) {
							System.out.println(zkt_rd1 + "\n");
						}
						zkr.close();
						System.out.println("Displaying all deductions...\n");
						str1 = s.concat(str5);
						ss = str3.concat(str1);
						System.out.println("Displaying all Interest Rates...\n");
						BufferedReader zk = new BufferedReader(
								new FileReader(ss));
						while((zkt_rd1 = zk.readLine()) != null) {
							tempvar = true;
							System.out.println(zkt_rd1 + "\n");
						}
						}
					}
					be.write(s + "\n");
					be.write(tmp1 + "\n");
					be.write(tmp2 + "\n");
					be.write(tmp3 + "\n");
					be.write(tmp4 + "\n");
					be.write(tmp5 + "\n");
					be.write(tmp6 + "\n");
					be.write(temp4 + "\n");
				}
			ne.close();
			be.close();
			file_copy_2();		
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	//______________________________________________________________
	boolean Account() {
		boolean tempvar = false;
		//String temp_check;
		System.out.println("Enter your acc  number: ");
		acc1 = in.nextInt();
		file_copy_1();
		//System.out.println("Enter the amount to deposit: ");
		try {
			BufferedReader out = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			BufferedWriter  btw = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));
				while((stracc = out.readLine()) != null) {
					//System.out.println("nProgram is exited!!!" + "\n");
					acc = Integer.valueOf(stracc);
					strtype = out.readLine();
					acctype = Integer.valueOf(strtype);
					strfree = out.readLine();
					notrans = Integer.valueOf(strfree);
					nam = out.readLine();
					mail = out.readLine();
					adr = out.readLine();
					time = out.readLine();
					strdep = out.readLine();
					getamount = Integer.valueOf(strdep);
					if(acc1 == acc) {
						int choice;
						System.out.println("What you want to do: ");
						System.out.println("1. Print Account Details\n");
						System.out.println("2. Deposit Amount\n");
						System.out.println("3. Withdraw Amount\n");
						System.out.println("4. Check Balance\n");
						System.out.println("5. Print Bank Statement\n");
						System.out.println("6. Transfer Amount\n");
						
						if(acctype == 2) {
							System.out.println("7. Calculate Zakat\n");
						}
						if(acctype == 1) {
							System.out.println("8. Calculate Interest\n");
						}
						System.out.println("9. Display All Deductions\n");
						System.out.println("0. Exit Menu\n");
						
						choice = in.nextInt();
						//__________________________________________________1
						if(choice == 1) {
							System.out.println(acc + "\n");
							printStatement(acc1);
						}
						
						//________________________________________________2
						else if(choice == 2) {
							System.out.println(acc + "\n");
							 makeDeposit(acc1);
							 System.out.println(acc + "\n");
						}
						//_______________________________________________3
						
						else if(choice == 3) {
							makeWithdrawal(acc1);
						}
						//______________________________________________4
						
						else if(choice == 4) {
							checkBalance(acc1);
						}
						//_____________________________________________5
						else if(choice == 5) {
							printStatement(acc1);
						}
						//___________________________________________________6
						else if(choice == 6) {
							int acc2 ;
							System.out.println("Enter second account number: ");
							acc2 = in.nextInt();
							transferAmount(acc,acc2);
						}
						else if(choice == 7) {
							if(acctype == 2) {
								calculateZakat(acc);
							}
							else {
								System.out.println("There is no Zakat for checking account...");
							}
						}
						else if(choice == 8) {
							if(acctype == 1) {
								calculateInterest(acc);
							}
							else {
								System.out.println("There is no Interest Rate for checking account...");
							}
						}
						else if(choice == 9) {
							displayAllDeductions(acc);
						}
						else if(choice == 0) {
							System.out.println("Program is exited!!!" + "\n");
							file_copy_2();
						}
						else {
							file_copy_2();
						}
						tempvar = true;
					} 
				}
				btw.close();
				out.close();
				System.out.println("Program is exited!!!" + "\n");
				file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	
	boolean createAcc() {
		boolean tempvar = false;
		System.out.println("Write you name: ");
		name = in.nextLine();
		System.out.println("Write you email: ");
		email = in.nextLine();
		System.out.println("Write you address: ");
		address = in.nextLine();
		System.out.println("Write your account type: \n");
		System.out.println("1. Checking Account\n");
		System.out.println("2. Saving Account\n");
		temp = in.nextInt();
		System.out.println("Enter the amount to deposit: ");
		tempdeposit = in.nextInt();
		String temp_rn,temp_add1,temp_add2,temp_det,temp_ded;
		temp_rn = String.valueOf(rn);
		String str1 = ".txt";
		String str2 = "-Zakat.txt";
		String str3 = "-Deductions.txt";
		String pl,pp,pq,pd;
		String store = "-Tax.txt";
		pl = temp_rn.concat(store);
		pp = temp_rn.concat(str2);
		pq = temp_rn.concat(str1);
		pd = temp_rn.concat(str3);
		String store1 = "C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\";
		temp_add1 = store1.concat(pl);
		temp_add2 = store1.concat(pp);
		temp_det = store1.concat(pq);
		temp_ded = store1.concat(pd);
		try {
			  FileWriter fstream = new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\AccountsManagement.txt",true);
			  BufferedWriter br = new BufferedWriter(fstream);
			  br.write(rn + "\n");
			  br.write(temp + "\n");
			  br.write(free + "\n");
			  br.write(name + "\n");
			  br.write(email + "\n");
			  br.write(address + "\n");
			  br.write("Account was made on: " + new java.util.Date()+"\n");
			  br.write(tempdeposit + "\n");
			  if(temp == 2) {
				  FileWriter zkt = new FileWriter(temp_add2,true);
				  BufferedWriter zb = new BufferedWriter(zkt);
				  zb.close();
			  }
			  else if(temp == 1) {
				  FileWriter tax = new FileWriter(temp_add1,true);
				  BufferedWriter tb = new BufferedWriter(tax);
				  tb.close();
			  }
			  FileWriter det = new FileWriter(temp_det,true);
			  BufferedWriter dt = new BufferedWriter(det);
			  dt.write("Ammount " + tempdeposit +" deposited on: "+ new java.util.Date()+"\n");
			  dt.close();
			  FileWriter ded = new FileWriter(temp_ded,true);
			  BufferedWriter dd = new BufferedWriter(ded);
			  dd.close();
			  br.close();
			  System.out.println("Processing....." + "\n");
			  System.out.println("Account has been created. Thank You!" + "\n");
			  tempvar = true;
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	
	boolean closeAccount(int accty) {
		boolean tempvar = false;
		try {
			file_copy_1();
			BufferedReader out = new BufferedReader(
					new FileReader("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\TempManagement.txt"));
			String s;
			BufferedWriter  btw = new BufferedWriter(
					new FileWriter("C:\\Users\\Abdul Samie\\eclipse-workspace\\JavaProject\\Temp1Management.txt"));

				while((stracc = out.readLine()) != null) {
					acc = Integer.valueOf(stracc);
					strtype = out.readLine();
					acctype = Integer.valueOf(strtype);
					strfree = out.readLine();
					notrans = Integer.valueOf(strfree);
					nam = out.readLine();
					mail = out.readLine();
					adr = out.readLine();
					time = out.readLine();
					strdep = out.readLine();
					getamount = Integer.valueOf(strdep);
					if(acc == accty) {
						System.out.println("Account has been deleted!!!" + "\n");
						tempvar = true;
					}else {
						btw.write(stracc + "\n");
						btw.write(strtype + "\n");
						btw.write(strfree + "\n");
						btw.write(nam + "\n");
						btw.write(mail + "\n");
						btw.write(adr + "\n");
						btw.write(time + "\n");
						btw.write(getamount + "\n");
					}
				}
			btw.close();
			out.close();
			file_copy_2();
		}catch(Exception ex) {
			return false;
		}
		return tempvar;
	}
	
	void bankowner() {
		System.out.println("Owner name: Abdul Samie" + "\n");
		System.out.println("Roll Number: 19I-0663" + "\n");
		System.out.println("Email: i190663@nu.edu.pk" + "\n");
	}
}  
class TestInheritance3{  
	public static void main(String args[]){  
		AccountManagement A = new AccountManagement();
		Scanner in = new Scanner(System.in);
		int acc_no, option;
		System.out.println("Welcome to the FAST-NUCES Bank!" + "\n");
		System.out.println("1. Create an account" + "\n");
		System.out.println("2. Close an account" + "\n");
		System.out.println("3. Account Information" + "\n");
		System.out.println("4. Bank Owner Details" + "\n");
		System.out.println("5. Close the Program!" + "\n");
		option = in.nextInt();
		if(option == 1) {
			A.createAcc();
		}
		else if(option == 2) {
			System.out.println("Enter Account Number:");
			acc_no = in.nextInt();
			A.closeAccount(acc_no);
		}
		else if(option == 3) {
			A.Account();
		}
		else if(option == 4) {
			A.bankowner();
		}
		else if(option == 5) {
			System.out.println("You've quitted the program!!" + "\n");
		}
		else {
			System.out.println("You pressed the wrong button!...Restart the program." + "\n");
		}
	}
}  