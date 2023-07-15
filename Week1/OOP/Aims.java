package Week1.OOP;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc d1 = new DigitalVideoDisc("B", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("The bitch", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("The beach", "Animation", "Roger Allers", 87, 19.95f);
        Book b = new Book("Abc", "book", 12.14f);
        CompactDisc cd = new CompactDisc("The bitch stupid", "Animation", "Roger Allers", 87, 19.95f, "talor sweet");
        Book b2 = new Book("Abc", "book", 15.15f);
        Book b3 = new Book("Abc", "bokdasd", 21.14f);
        Book b4 = new Book("bc", "bokdasd", 21.14f);
        CompactDisc cd2 = new CompactDisc("The hunter", "Animation", "Roger Allers", 87, 19.95f, "talor sweet");
        CompactDisc cd3 = new CompactDisc("The hunter 1", "Animation", "Roger Allers", 87, 19.95f, "talor sweet");
        CompactDisc cd4 = new CompactDisc("The hunter 2", "Animation", "Roger Allers", 87, 19.95f, "talor sweet");
        CompactDisc cd5 = new CompactDisc("The hunter 3", "Animation", "Roger Allers", 87, 19.95f, "talor sweet");

        store.addMedia(d1);
        store.addMedia(b);
        store.addMedia(b4);
        store.addMedia(b2);
        store.addMedia(b3);
        store.addMedia(d2);
        store.addMedia(d3);
        store.addMedia(cd2, cd3, cd4, cd5);


        boolean loop = true;
        Scanner input = new Scanner(System.in);
//		Store store = new Store();
        Cart cart = new Cart();

		int opt = -1;
		while(loop) {
			showMenu();
			System.out.println("Your choice: ");
			opt = input.nextInt();
			input.nextLine();

			switch(opt) {
				case 1:
					boolean storeLoop = true;
					store.showStore();
//					storeMenu();
					while(storeLoop) {
						storeMenu();
						int storeOpt = -1;
						System.out.println("Your choice: ");
						storeOpt = input.nextInt();
						input.nextLine();

						switch(storeOpt) {
							case 1:
								System.out.println("Enter title: ");
								String mediaTitle = input.nextLine();
								Media m = null;
								if(mediaTitle.length() > 0) {
										m = store.searchByTitle(mediaTitle);
										if(m != null) {
											System.out.println(m.toString());
										}
								}else{
									System.out.println("Invalid input title");
									break;
								}
								boolean detailsLoop = true;

								while(detailsLoop) {
									mediaDetailsMenu();

									System.out.println("Your choice: ");
									int detailOpt = input.nextInt();
									input.nextLine();

									switch(detailOpt) {
										case 1:
											cart.addMedia(m);
											break;
										case 2:
											if(m instanceof DigitalVideoDisc) {
												((DigitalVideoDisc)m).play();
											}else if(m instanceof CompactDisc) {
												((CompactDisc)m).play();
											}else {
												System.out.println("Type of media can not be played");
											}
											break;
										default:
											detailsLoop = false;
											break;
									}

								}
								break;
							case 2:
								System.out.println("Enter title: ");
								String mediaTitle2 = input.nextLine();

								Media m2 = null;
								if(mediaTitle2.length() > 0) {
										m2 = store.searchByTitle(mediaTitle2);
										if(m2 != null) {
//											System.out.println(m.toString());
											cart.addMedia(m2);
										}
										break;
								}else{
									System.out.println("Invalid input title");
									break;
								}
							case 3:
								System.out.println("Enter title: ");
								String mediaTitle3 = input.nextLine();

								Media m3 = null;
								if(mediaTitle3.length() > 0) {
										m3 = store.searchByTitle(mediaTitle3);
										if(m3 != null) {
//											System.out.println(m.toString());
											if(m3 instanceof DigitalVideoDisc) {
												((DigitalVideoDisc)m3).play();
											}else if(m3 instanceof CompactDisc) {
												((CompactDisc)m3).play();
											}else {
												System.out.println("Type of media can not be played");
											}
											break;
										}
										break;
								}else{
									System.out.println("Invalid input title");
									break;
								}
							case 4:
								cart.print();
								break;
							default:
								storeLoop = false;
								break;
						}
					}
					break;
				case 2:
					boolean updateLoop = true;

					while(updateLoop) {
						updateStore();
						System.out.println("Your choice: ");
						int updateOpt = input.nextInt();
						input.nextLine();

						switch(updateOpt) {
							case 1:
								System.out.println("Title: ");
								String newTitle = input.nextLine();
								System.out.println("Category: ");
								String newCategory = input.nextLine();
								System.out.println("Cost: ");
								Float newCost = input.nextFloat();
								input.nextLine();

								System.out.println("1. Book");
								System.out.println("2. DVD");
								System.out.println("3. CD");

								System.out.println("Your choice: ");
								int type = input.nextInt();
								input.nextLine();

								if(type == 1) {
									Book book = new Book(newTitle, newCategory, newCost);
									store.addMedia(book);
								}else if(type == 2) {
									DigitalVideoDisc dvd = new DigitalVideoDisc(newTitle, newCategory, newCost);
									store.addMedia(dvd);
								}else if(type == 3) {
									CompactDisc cd1 = new CompactDisc(newTitle, newCategory, newCost);
									store.addMedia(cd1);
								}else {
									System.out.print("Invalid media");
									break;
								}

								break;
							case 2:
								System.out.println("Enter title: ");
								String mTitle = input.nextLine();

								int result = store.removeMedia(mTitle);
								if(result == 0) {
									System.out.println("Not found media");
								}
								break;
							default:
								updateLoop = false;
								break;
						}
					}
					break;
				case 3:
					cart.print();

					boolean cartLoop = true;
					while(cartLoop) {
						cartMenu();
						System.out.println("Your choice: ");
						int cartOpt = input.nextInt();
						input.nextLine();

						switch(cartOpt) {
						case 1:
							// not understand the requirements
							cart.print();
							break;
						case 2:
							System.out.println("1. Sort by title");
							System.out.println("2. Sort by cost");

							System.out.println("Your choice: ");
							int sortType = input.nextInt();
							input.nextLine();

							if(sortType == 1) {
//								Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
							}else if(sortType == 2) {
//								Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
							}else {
								System.out.println("Invalid sort type");
								break;
							}
							cart.print();

							break;
						case 3:
							System.out.println("Enter title: ");
							String mediaTitle = input.nextLine();

							if(mediaTitle.length() > 0) {
								cart.removeMedia(mediaTitle);
							}else {
								System.out.println("Invalid input title");
							}

							break;
						case 4:
							System.out.println("Enter title: ");
							String mediaTitle3 = input.nextLine();

							if(mediaTitle3.length() > 0) {
								Media m3 = cart.searchByTitle(mediaTitle3);
								if(m3 != null) {
//									System.out.println(m.toString());
									if(m3 instanceof DigitalVideoDisc) {
										((DigitalVideoDisc)m3).play();
									}else if(m3 instanceof CompactDisc) {
										((CompactDisc)m3).play();
									}else {
										System.out.println("Type of media can not be played");
									}
									break;
								}
							}else {
								System.out.println("Invalid input title");
							}
							break;
						case 5:
							System.out.println("Order created");

							cart.emptyCart();
							break;
						default:
							cartLoop = false;
							break;
						}
					}

					break;
				default:
					loop = false;
					break;
			}
		}
		System.out.println("Goodbye--------------------");
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("-------------------------------");
        System.out.println("1. View Store");// storeMenu
        System.out.println("2. Update Store"); // add or remove media
        System.out.println("3. See current cart"); // cartMenu
        System.out.println("0. Exit");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. See a media's details");// enter title - check
        System.out.println("2. Add a media to cart"); //
        System.out.println("3. Play a media"); //
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Filter medias in cart"); // filter by id, title
        System.out.println("2. Sort medias in cart"); // by title or by cost
        System.out.println("3. Remove medias from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");// notify and clear cart
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void updateStore() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Add media"); // enter info
        System.out.println("2. Remove media"); // enter title
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

}
