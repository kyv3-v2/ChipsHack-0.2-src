package me.cumhax.chipshack.setting;

import me.cumhax.chipshack.module.Module;

import java.util.List;

public class Setting {
	private final String name;
	private final Module module;
	private final SettingType type;
	private boolean booleanValue;
	private int integerValue;
	private int minIntegerValue;
	private int maxIntegerValue;
	private String enumValue;
	private List<String> enumValues;

	public Setting ( String name, Module module, double intValue, double intMinValue, double intMaxValue ) {
		this.name=name;
		this.module=module;
		this.integerValue=(int) intValue;
		this.minIntegerValue=(int) intMinValue;
		this.maxIntegerValue=(int) intMaxValue;
		this.type=SettingType.INTEGER;
	}

	public Setting ( String name, Module module, boolean boolValue ) {
		this.name=name;
		this.module=module;
		this.booleanValue=boolValue;
		this.type=SettingType.BOOLEAN;
	}

	public Setting ( String name, Module module, List<String> enumValues ) {
		this.name=name;
		this.module=module;
		this.enumValue=enumValues.get ( 0 );
		this.enumValues=enumValues;
		this.type=SettingType.ENUM;
	}

	public String getName () {
		return name;
	}

	public Module getModule () {
		return module;
	}

	public SettingType getType () {
		return type;
	}

	public boolean getBooleanValue () {
		return booleanValue;
	}

	public void setBooleanValue ( boolean booleanValue ) {
		this.booleanValue=booleanValue;
	}

	public int getIntegerValue () {
		return integerValue;
	}

	public void setIntegerValue ( int integerValue ) {
		this.integerValue=integerValue;
	}

	public int getMinIntegerValue () {
		return minIntegerValue;
	}

	public int getMaxIntegerValue () {
		return maxIntegerValue;
	}

	public boolean isInteger () {
		return type.equals ( "int" );
	}

	public boolean isBoolean () {
		return type.equals ( "boolean" );
	}

	public boolean isEnum () {
		return type.equals ( "enum" );
	}

	public String getEnumValue () {
		return enumValue;
	}

	public void setEnumValue ( String enumValue ) {
		this.enumValue=enumValues.contains ( enumValue ) ? enumValue : this.enumValue; // only change value if list includes it.
	}

	public List<String> getEnumValues () {
		return enumValues;
	}

	public boolean isEnabled () {
		return false;
	}

	public Object getValue () {
		return null;
	}

	public float getIntValue () {
		return 0;
	}

	public boolean get_value ( boolean b ) {
		return false;
	}

	public boolean getBoolValue () {
		return false;
	}

	public float get_value ( int i ) {
		return 0;
	}

	public boolean in ( String all ) {
		return false;
	}

	public boolean is ( String inHole ) {
		return false;
	}
}