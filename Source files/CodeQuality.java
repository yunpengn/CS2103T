public Class CodeQuality {
	private static final String MESSAGE_COMMAND_HELP_PARAMETER = "Parameters: %1$s";
	private static final String MESSAGE_COMMAND_HELP_EXAMPLE = "Example: %1$s";
	private static final String MESSAGE_COMMAND_INVALID_FORMAT = "Invalid command format: %1$s";
	private static final String MESSAGE_DISPLAY_PERSON_DATA = "%1$s  Phone Number: %2$s  Email: %3$s";
	private static final String MESSAGE_GOODBYE = "Exiting Address Book... Good bye!";

	/** List of all persons in the address book. */
	private static final ArrayList<String> people = new ArrayList<>();

    /**
     * The main driving function for the application.
     */
    public static void main(String[] args) {
	    initializeApplication(args);
	    runApplication();
	}

    /**
     * Initializes the application by receiving the user's added arugments and load data from
     * local storage.
     *
     * @param args is the added arguments from command line
     */
    private static void initializeApplication(String[] args) {
		showWelcomeMessage();
	    processProgramArgs(args);
	    loadDataFromStorage();
	}

    /**
     * Runs the application by keeping asking the user to enter command, execute the
     * command, and show the result to the user.
     */
    private static void runApplication() {
		while (true) {
	        String userCommand = getUserCommand();
	        String feedback = executeCommand(userCommand);
	        showResultToUser(feedback);
	    }
	}

    /**
     * Gets the user command input from standard input device.
     *
     * @return the user's command in String format
     */
    private static String getUserCommand() {
		System.out.print("Enter command: ");
		String userCommand = SCANNER.nextLine();
		userCommand = userCommand.trim();
		showToUser(userCommand);

		return userCommand;
	}

	/**
	 * Shows a message to the user
	 *
	 * @param message the message to be shown
	 */
	private static void showToUser(String message) {
		System.out.println(LINE_PREFIX + m);
	}
}
