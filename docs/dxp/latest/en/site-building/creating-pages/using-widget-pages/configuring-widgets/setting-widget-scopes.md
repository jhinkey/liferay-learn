# Setting Widget Scopes

Roles can be scoped by the instance, by Site, or by an Organization, and it only takes effect within its scope. For example, a Message Boards Administrator Role with complete access to the Message Boards has different permissions based on the Role's scope. If it's a global Role, members have permission to administer message boards across the entire installation. If it's a Site Role, members only have permission to administer message boards within the Site where they've been assigned the Role. For Organizations with Sites, Site Roles are automatically assigned to Organization members based on the Organization Roles they have. For an Organization-scoped Message Boards administrator Role, members only have permission to administer message boards within the Site of the Organization that assigned the Role to them.

First, select a scope for your widget:

**Default**: by default, when a widget is added to a page in a Site, it is *scoped* for that Site. This means its data belongs to that Site. If the widget is added to a page in a different Site, it employs a completely different data set. This enables you to place a Message Boards widget in one Site with one set of categories and threads, and place another Message Boards widget in a different Site with a different set of categories and threads.

**Global**: Scoping by Site means that you can only have one Message Boards widget per Site. If you add one Message Boards widget to a page in a Site and add another Message Boards widget to a different page in the same Site, the second Message Boards widget contains exactly the same data as the first. This is because, by default, the Message Boards widget is scoped by Site. Most of Liferay's DXP other widgets also default to being scoped by Site.

**Page**: The data sets of page-scoped widget serve a single page, not an entire Site. If you set the scope of a widget to *page* instead of *Site*, you can add any number of widgets to different pages, and then they have different sets of data. You can have more than one message board per Site if you wish. Most widgets, however, default to the "native" configuration, and have their scopes set to the Site where they are placed.

Unless otherwise noted, all widgets support scoping by instance (global), Site (default), or page. This grants you some flexibility in how you want to set up your Liferay instance. You can configure the scope of an app with just a few simple steps.

1.  Click on *Options* (![Options](../../../../images/icon-app-options.png)) in the app window &rarr; *Configuration* &rarr; *Scope* tab.

1.  Use the drop-down menu to set the scope.

    ![You can change the scope of your application by navigating to its Configuration menu.](./setting-widget-scopes/images/01.png)

Once you've defined a page scope for a widget, the Menu provides a *Default Scope* dropdown that allows you to select the page.

That's all it takes to change the scope for a particular widget. By setting the scope to the current page, you can add as many of these widgets to a Site as you want, provided they are all added to separate pages.

## Additional Information

- [Configuring Templates](./configuring-templates.md)