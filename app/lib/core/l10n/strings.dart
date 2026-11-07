/// English UI strings.
///
/// Names follow the reference application's own l10n keys (`docs/reference/original_l10n_keys.txt`)
/// wherever a key was recoverable from the shipping binary, so parity work can be tracked
/// key-by-key. Only English ships in this build: the reference supports 13 locales, and shipping
/// machine-produced translations would be worse than an explicit, documented gap.
class S {
  // Shell / modules
  static const library = 'Library';
  static const plot = 'Plot';
  static const write = 'Write';
  static const books = 'Books';
  static const organize = 'Organize';
  static const schedule = 'Schedule';
  static const preview = 'Preview';
  static const backup = 'Backup';
  static const settings = 'Settings';
  static const project = 'Project';
  static const projects = 'Projects';

  // Library
  static const addProject = 'Add project';
  static const editProject = 'Edit project';
  static const deleteProject = 'Delete project';
  static const setCover = 'Set cover';
  static const clearCover = 'Clear cover';
  static const fromGallery = 'From gallery';
  static const noBooksToDisplay = 'No projects to display';
  static const createFirstProject = 'Create your first project to start writing';
  static const backedUp = 'Backed up';
  static const lastSync = 'Last cloud sync';
  static const needsBackup = 'Needs backup';
  static const lastBackupDate = 'Last backup';
  static const sortBy = 'Sort by';
  static const gridView = 'Grid';
  static const listView = 'List';
  static const ascending = 'Ascending';
  static const descending = 'Descending';

  // Common actions
  static const add = 'Add';
  static const save = 'Save';
  static const delete = 'Delete';
  static const cancel = 'Cancel';
  static const ok = 'OK';
  static const rename = 'Rename';
  static const edit = 'Edit';
  static const done = 'Done';
  static const close = 'Close';
  static const reorderUp = 'Move up';
  static const reorderDown = 'Move down';
  static const select = 'Select';
  static const merge = 'Merge';
  static const restore = 'Restore';
  static const copy = 'Copy';
  static const paste = 'Paste';
  static const search = 'Search';
  static const notSet = 'Not set';
  static const comingSoon = 'Coming soon';
  static const pleaseEnterATitle = 'Please enter a title';
  static const pleaseEnterAName = 'Please enter a name';
  static const areYouSureYouWantToDelete = 'Are you sure you want to delete?';

  // Plot
  static const categories = 'Categories';
  static const addCategory = 'Add category';
  static const editCategory = 'Edit category';
  static const noCategoriesToDisplay = 'No categories to display';
  static const noItemsToDisplay = 'No items to display';
  static const addItem = 'Add item';
  static const editItem = 'Edit item';
  static const synopsis = 'Synopsis';
  static const description = 'Description';
  static const metadata = 'Metadata';
  static const names = 'Names';
  static const notes = 'Notes';
  static const pictures = 'Pictures';
  static const relationships = 'Relationships';
  static const history = 'History';
  static const statuses = 'Statuses';
  static const subplots = 'Subplots';
  static const tags = 'Tags';
  static const addStatus = 'Add status';
  static const editStatus = 'Edit status';
  static const addSubplot = 'Add subplot';
  static const editSubplot = 'Edit subplot';
  static const addTag = 'Add tag';
  static const editTag = 'Edit tag';
  static const addMetadataGroup = 'Add metadata group';
  static const editMetadataGroup = 'Edit metadata group';
  static const addMetadataElement = 'Add metadata element';
  static const editMetadataElement = 'Edit metadata element';
  static const showOnItemCard = 'Show on item card';
  static const addName = 'Add name';
  static const editName = 'Edit name';
  static const addNote = 'Add note';
  static const editNote = 'Edit note';
  static const addPicture = 'Add picture';
  static const addRelationship = 'Add relationship';
  static const editRelationship = 'Edit relationship';
  static const otherItem = 'Other item';
  static const isRelevant = 'Relevant';
  static const pickColour = 'Pick colour';
  static const itemHasNoDescription = 'No description yet';
  static const mergeItems = 'Merge items';
  static const mergeInto = 'Merge into';
  static const noNamesToDisplay = 'No names to display';
  static const noNotesToDisplay = 'No notes to display';
  static const noPicturesToDisplay = 'No pictures to display';
  static const noRelationshipsToDisplay = 'No relationships to display';
  static const noMetadataGroupsToDisplay = 'No metadata groups to display';
  static const noMetadataElementsToDisplay = 'No metadata elements to display';
  static const noStatusesToDisplay = 'No statuses to display';
  static const noSubplotsToDisplay = 'No subplots to display';
  static const noTagsToDisplay = 'No tags to display';
  static const noHistoriesToDisplay = 'No previous versions to display';

  // Write
  static const scenes = 'Scenes';
  static const addScene = 'Add scene';
  static const editScene = 'Edit scene';
  static const noScenesToDisplay = 'No scenes to display';
  static const sceneTitle = 'Scene title';
  static const attachItems = 'Attach items';
  static const splitScene = 'Split scene';
  static const splitAtCursor = 'Split at cursor';
  static const sceneNotes = 'Scene notes';
  static const scenePictures = 'Scene pictures';
  static const sceneSubplots = 'Subplots';
  static const insertMention = 'Mention an item';
  static const saved = 'Saved';
  static const saving = 'Saving…';
  static const alignLeft = 'Align left';
  static const alignCenter = 'Align centre';
  static const alignRight = 'Align right';
  static const alignJustify = 'Justify';
  static const words = 'words';
  static const reference = 'Reference';

  // Books
  static const addBook = 'Add book';
  static const editBook = 'Edit book';
  static const noBooksInProject = 'No books yet';
  static const bookTitle = 'Book title';
  static const author = 'Author';
  static const genre = 'Genre';
  static const language = 'Language';
  static const publisher = 'Publisher';
  static const isbn = 'ISBN';
  static const copyright = 'Copyright';
  static const addSection = 'Add section';
  static const addSubsection = 'Add subsection';
  static const editSection = 'Edit section';
  static const attachScenes = 'Attach existing scenes';
  static const selectScenes = 'Select scenes';
  static const noSectionsToDisplay = 'No sections yet';
  static const removeFromSection = 'Remove from section';
  static const includeInCompile = 'Include when compiling';
  static const showTableOfContents = 'Show table of contents';
  static const tableOfContentsTitle = 'Table of contents title';
  static const applyAutomaticIndentation = 'Apply automatic indentation';
  static const bookSettings = 'Book settings';
  static const wordsInBook = 'Words in book';
  static const sceneCount = 'Scenes';
  static const exportAndShare = 'Export and share';

  // Schedule
  static const setGoals = 'Set goals';
  static const wordGoal = 'Word count goal';
  static const deadline = 'Deadline';
  static const dueDate = 'Due date';
  static const remainingDays = 'Remaining days';
  static const totalWords = 'Total words';
  static const writingDays = 'Writing days';
  static const currentStreak = 'Current streak';
  static const longestStreak = 'Longest streak';
  static const noProgressesToDisplay = 'No progress recorded yet';
  static const addProgress = 'Add progress';
  static const calendarEntryMode = 'Calendar entry mode';
  static const dailyProgress = 'Daily progress';
  static const progress = 'Progress';
  static const selectedDate = 'Date';

  // Preview / compile
  static const selectAFormat = 'Select a format';
  static const includeSections = 'Include sections';
  static const includeScenes = 'Include scenes';
  static const includeItems = 'Include items';
  static const compileSelection = 'Compile';
  static const atLeastOneSectionRequired = 'At least one section is required to compile';
  static const nothingToCompile = 'Nothing to compile';
  static const zoomIn = 'Zoom in';
  static const zoomOut = 'Zoom out';
  static const epubDescription = 'EPUB – ideal for eBook publishing';
  static const odtDescription = 'ODT – compatible with word processors';
  static const htmlDescription = 'HTML – general purpose or web publishing';
  static const copyIntoClipboard = 'Copy into clipboard';
  static const copied = 'Copied';

  // Backup / restore
  static const createBackup = 'Create backup';
  static const restoreBackup = 'Restore backup';
  static const invalidBackupFile = 'Invalid backup file';
  static const backupCreated = 'Backup created';
  static const backupRestored = 'Backup restored';
  static const noAppsCanPerformThisAction = 'No apps can perform this action';
  static const restoreFromHistory = 'Restore this version';
  static const cloud = 'Cloud';
  static const cloudNotConnected = 'Cloud backup is not configured';
  static const sendToCloud = 'Send to cloud';
  static const receiveFromCloud = 'Receive from cloud';

  // Settings
  static const theme = 'Theme';
  static const light = 'Light';
  static const dark = 'Dark';
  static const system = 'System';
  static const font = 'Font';
  static const fontSize = 'Font size';
  static const lineHeight = 'Line height';
  static const smartQuotes = 'Smart quotes';
  static const smartGuillemets = 'Smart guillemets';
  static const smartHyphens = 'Smart hyphens';
  static const smartEllipsis = 'Smart ellipsis';
  static const setAutomaticCorrection = 'Automatic correction';
  static const quickGuide = 'Quick guide';
  static const helpCenter = 'Help centre';
  static const noQuestionsToDisplay = 'No questions to display';
  static const faq = 'FAQ';
  static const privacyPolicy = 'Privacy policy';
  static const termsAndConditions = 'Terms and conditions';
  static const about = 'About';
  static const version = 'Version';
  static const thirdPartyLibraries = 'Third-party libraries';
  static const emailSupport = 'Email support';
  static const webVersion = 'Web version';
  static const youtubeChannel = 'YouTube channel';
  static const facebookPage = 'Facebook page';
  static const englishOnlyNote = 'English (more languages not yet provided)';

  // Errors
  static const anErrorOccurred = 'An error occurred';
  static const pleaseCreateAProjectBefore = 'Please create a project before';
}

/// Fixed destinations of the project workspace drawer, mirroring the module set documented in the
/// bundled quick-start guide.
enum WorkspaceSection { books, plot, write, schedule }
