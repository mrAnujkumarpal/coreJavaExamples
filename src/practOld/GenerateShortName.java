package practOld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateShortName {

	final static String EMPTY_STRING = "";
	public static void main(String[] args) {
		
		//String regName = formObject.getNGValue("CORP_BUSS_ENTITY_NAME"CORP_BUSS_ENTITY_NAME);
		//String regDate = formObject.getNGValue("CORP_BUSS_REG_DATE"CORP_BUSS_REG_DATE);24-APR-17
		String regDate="24/09/2017";
		String regName="EN-GREEN FIELDS LIMITED";
		
		String shortName = generateShortName(false, regName, null,regDate);
		System.out.println("shortName " + shortName );
		
		// TODO Auto-generated method stub

	}
	
	protected static String generateShortName(boolean isIndv, String firstName, String lastName, String date) 
	{
		StringBuilder shortName = new StringBuilder();
		try 
		{
			if (isIndv) 
			{
				// For Individual
				if (lastName != null && !lastName.trim().isEmpty()) 
				{
					if (lastName.length() <= 4) 
					{
						shortName.append(lastName);
					} else 
					{
						shortName.append(lastName.substring(0, 4));
					}
				}

				if (firstName != null && !firstName.isEmpty()) 
				{
					if (firstName.length() <= 1) 
					{
						shortName.append(firstName);
					}
					else 
					{
						shortName.append(firstName.substring(0, 1));
					}
				}
				// Appending birth date
				
				shortName.append(formatDateStringNew(date, "dd/MM/yyyy", "ddMMyy"));
			} 
			else 
			{
				// For Corporates
				if (firstName != null && !firstName.trim().isEmpty()) 
				{
					if (firstName.length() <= 5) 
					{
						shortName.append(firstName);
					} 
					else
					{
						shortName.append(firstName.substring(0, 5));
					}
				}
				if (date != null && !date.trim().isEmpty()) 
				{
					shortName.append(formatDateStringNew(date, "dd/MM/yyyy", "ddMMyy"));
				}
			}
			
			shortName=new StringBuilder(concatTimeStamp((shortName.toString())));
			return shortName.toString();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return shortName.toString();
		}
	}
	
	
	@SuppressWarnings("finally")
	public static String formatDateStringNew(String inputDate,String inputDateFormat,String outputDateFormat)
		{
			String result = null;
			try 
			{
					SimpleDateFormat sdfSource = new SimpleDateFormat(inputDateFormat);
					Date date = sdfSource.parse(inputDate);
					SimpleDateFormat sdfDestination = new SimpleDateFormat(outputDateFormat);
					result = sdfDestination.format(date);
			} catch (Exception e) 
			{
				System.out.println("Exception Raised from formatDateStringNew()-->" + e);
				
			} 
			finally 
			{			
				return result;
			}
		}
	
	 public static String concatTimeStamp(String shortName)
	 {
			String msgId = EMPTY_STRING;
			try
			{
				SimpleDateFormat ngFormat = new SimpleDateFormat("sSSS");
				Date date = new Date();
				
				String ngDate = ngFormat.format(date);
				msgId = restrictString(shortName,11) + restrictStringFromLeft(ngDate,4);
				
				msgId=restrictString(msgId, 15).toUpperCase();
			}
			catch(Exception e)
			{
				System.out.println("Exception in generateMessageId()--->"+ e);
			}
			return msgId;
		}
	 public static String restrictString(String str, int length) 
	 {
			if (str != null) 
			{
				if (str.length() > length) 
				{
					return str.substring(0, length);
				} 
				else 
				{
					return str;
				}
			} 
			else 
			{
				return EMPTY_STRING;
			}
		}
	 public static String restrictStringFromLeft(String str, int length) {

		 if (str != null) {

			 if (str.length() > length) {
				 return str.substring((str.length()-length), str.length());

			 } else {

				 return str;
			 	}

		 } else {

			 return EMPTY_STRING;

		 }

	 }
}
