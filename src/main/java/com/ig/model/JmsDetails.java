package com.ig.model;

import java.util.Objects;

public class JmsDetails {

        private String brokerConnection;
        private String brokerUsername;
        private String brokerPassword;
        private String destination;
        private String destinationType;


    public JmsDetails(String brokerConnection, String brokerUsername, String brokerPassword, String destination, String destinationType) {
        this.brokerConnection = brokerConnection;
        this.brokerUsername = brokerUsername;
        this.brokerPassword = brokerPassword;
        this.destination = destination;
        this.destinationType = destinationType;
    }

    public JmsDetails() {

    }

    public String getBrokerConnection() {
        return brokerConnection;
    }

    public void setBrokerConnection(String brokerConnection) {
        this.brokerConnection = brokerConnection;
    }

    public String getBrokerUsername() {
        return brokerUsername;
    }

    public void setBrokerUsername(String brokerUsername) {
        this.brokerUsername = brokerUsername;
    }

    public String getBrokerPassword() {
        return brokerPassword;
    }

    public void setBrokerPassword(String brokerPassword) {
        this.brokerPassword = brokerPassword;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JmsDetails that = (JmsDetails) o;
        return Objects.equals(brokerConnection, that.brokerConnection) &&
                Objects.equals(brokerUsername, that.brokerUsername) &&
                Objects.equals(brokerPassword, that.brokerPassword) &&
                Objects.equals(destination, that.destination) &&
                Objects.equals(destinationType, that.destinationType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brokerConnection, brokerUsername, brokerPassword, destination, destinationType);
    }

    @Override
    public String toString() {
        return "JmsDetails{" +
                "brokerConnection='" + brokerConnection + '\'' +
                ", brokerUsername='" + brokerUsername + '\'' +
                ", brokerPassword='" + brokerPassword + '\'' +
                ", destination='" + destination + '\'' +
                ", destinationType='" + destinationType + '\'' +
                '}';
    }
}