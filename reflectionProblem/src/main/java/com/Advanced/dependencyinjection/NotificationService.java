package com.Advanced.dependencyinjection;
public class NotificationService {
    @Inject
	public MessageService messageService; // 🔹 This field will be injected!

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}
