/*************************************************************************
class UI (user interface)  aUI manager the user interface

promptCommand()
promptID()
showFinishMsg()
showWelcomeMsg(name)
UI() construct aUI
*************************************************************************/
public class UI
	/*----------------------------------------------------------------------------------------------------------
	UI() constructor
	----------------------------------------------------------------------------------------------------------*/
	UI(){}

	/*-------------------------------------------------------------------------------------------------------------
	promptCommand() ask for command
	exception: NoSuchCommandExceptions
	return: inputCommand
	-------------------------------------------------------------------------------------------------------------*/
	prompt user for inputCommand
		if inputCommand is not G(Grade),R(Rank), W(Weights), or E(Exit)
			throws an object of NoSuchCommandExceptions  end if
		else if inputCommand is E (Exit) then return inputCommand
		else:
			situation 1 : G
			situation 2 : R
			situation 3 : W
		end if
	return inputCommand
	
	/*-------------------------------------------------------------------------------------------------------------
	promptID() ask for user's ID
	return: ID or Q
	-------------------------------------------------------------------------------------------------------------*/
	prompt user for ID or command Q
		if input is Q
			returnValue is Q
		else if input is ID
			returnValue is ID
		end if
	return returnValue
	
	/*-------------------------------------------------------------------------------------------------------------
	showFinishMsg() show msg in the end
	return: boolean 
	-------------------------------------------------------------------------------------------------------------*/
	print the msg : 結束了
	return true
	
	/*-------------------------------------------------------------------------------------------------------------
	showWelcomeMsg(name) show msg in the beginning
	parameter: user's name
	return: boolean 
	-------------------------------------------------------------------------------------------------------------*/
	print the welcome msg to user, e.g.: Welcome 李威廷
	return true
end class UI