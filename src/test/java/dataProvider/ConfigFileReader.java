package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	private Properties properties;

	private final String propertyFilePath = "configs//Configuration.properties";

	public ConfigFileReader() {
		try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not closable", e);
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public Long getImplicitlyWait() {
		try {

			String implicitlyWait = properties.getProperty("implicitlyWait");

			Long parsedLong = Long.parseLong(implicitlyWait.toString());
			return parsedLong;
		} catch (Exception e) {
			throw new RuntimeException("An exception occured" + e);
		}
	}

	public String getApplicationUrl(boolean getAdmin, boolean getbuyer, boolean getorchid, boolean getSupplier)
		String implicitlyWait = properties.getProperty("implicitlyWait");

		Long parsedLong = Long.parseLong(implicitlyWait.toString());
		return parsedLong;
		} catch (Exception e) {
		throw new RuntimeException("An exception occured" + e);
		}
		}
	
	public String getApplicationUrl(boolean getAdmin, boolean getbuyer, boolean getorchid,boolean getSupplier) 
		String url = "";
		String[] urls = properties.getProperty("url").split(",");
		String adminurl = urls[0];
		String buyerurl = urls[1];
		String orchid = urls[2];
		String supplierurl = urls[3];
		if (getAdmin) {
			url = adminurl;
		} else if (getbuyer) {
			url = buyerurl;
		} else if (getorchid) {
			url = orchid;
		} else if (getSupplier) {
			url = supplierurl;
		}

		return url;
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}
}
