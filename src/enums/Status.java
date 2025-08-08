package enums;

public enum Status {
        SUCCESS(200),
        FAIL(404),
        ERROR(500);
        private final int id;
        Status(int id)
        {
            this.id = id;
        }

        public int getCode()
        {
            return id;
        }
}
