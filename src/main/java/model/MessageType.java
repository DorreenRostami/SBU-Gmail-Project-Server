package model;

import java.io.Serializable;

public enum MessageType implements Serializable {
    /**
     * when user first signs in
     */
    signIn,
    /**
     * when user creates a new account
     */
    signUp,
    /**
     * when user is done adding additional info
     */
    makeAccount,
    /**
     * when user wants to view their updated inbox list
     */
    inbox,
    /**
     * when user wants to view their updated sent list
     */
    sent,
    /**
     * when user wants to change their account information
     */
    changeInfo,
    /**
     * when user wants to send an email
     */
    send,
    /**
     * when changes have been made to a list
     */
    updateInbox,
    updateSent,
    /**
     * when user has blocked/unblocked another user
     */
    block,
    unblock
}