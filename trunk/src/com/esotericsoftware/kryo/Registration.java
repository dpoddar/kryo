
package com.esotericsoftware.kryo;

/** Describes the {@link Serializer} to use for a class. */
public class Registration {
	private final Class type;
	private final int id;
	private Serializer serializer;

	public Registration (Class type, int id, Serializer serializer) {
		this.type = type;
		this.id = id;
		this.serializer = serializer;
	}

	public Class getType () {
		return type;
	}

	public int getId () {
		return id;
	}

	public Serializer getSerializer () {
		return serializer;
	}

	public void setSerializer (Serializer serializer) {
		this.serializer = serializer;
	}
}
